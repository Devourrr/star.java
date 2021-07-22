class DiamondStar2
{
      public static void main(String[] args)
      {
            for(int i=0, n=0; i <=10;i++) {
                  for(int j=0; j <= n+(5-n)*2+1; j++) {
                        System.out.print((j<=n)? " " : "*");
                  }
                  System.out.println();
                  if (i<5) {n++;} else { n--;}
            }
      }
}