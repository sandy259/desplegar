class Principal {
  private static void dormir() {
    try { Thread.sleep(5000); }
    catch (InterruptedException ex) { 
      Thread.currentThread().interrupt(); 
    }
  }
  public static void main(String[] args) {
    System.out.println("3");
    dormir();
    System.out.println("2");
    dormir();
    System.out.println("1");
  }
}