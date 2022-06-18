class Tester {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int n = s.nextInt(); 
    int first = 0, second = 1;
    for (int i = 1; i <= n; ++i) 
    {
      System.out.print(first + ", "); // 0,1,1,2,3,5,8,13,....
      int next = first + second;
      first = second;
      second = next;
    }
  }
}
