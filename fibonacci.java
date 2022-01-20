class Tester {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int n = s.nextInt(); 
    int first = 0, second = 1;
    for (int i = 1; i <= n; ++i) 
    {
      System.out.print(first + ", ");
      int next = first + second;
      first = second;
      second = next;
    }
  }
}
