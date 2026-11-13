public class Smoke {
  public static void main(String[] args) throws Exception {
    if (org.stellar.sdk.KeyPair.fromSecretSeed(new byte[32]).getAccountId().charAt(0) != 'G')
      throw new AssertionError("Stellar keypair failed");
    Class.forName("com.soneso.stellar.sdk.KeyPair");
    if (!new com.google.gson.Gson().toJson("ok").equals("\"ok\""))
      throw new AssertionError("Gson failed");
    System.out.println("Java SDK, KMP JVM artifact and control smoke checks passed.");
  }
}
