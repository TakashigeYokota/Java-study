import java.util.Random;

public class zundoko {

  enum ズンドコ{
    ズン,
    ドコ
  }

  public static final String キヨシ = "キ・ヨ・シ！";

  public static void main(String[] args) {
    Random rand = new Random();
    int z = 0;
    while(true){
      ズンドコ zd = ズンドコ.values()[rand.nextInt(2)];
      System.out.print(zd.name());
      switch (zd){
        case ズン:
          z++;
          break;
        case ドコ:
          if(z>4){
            System.out.println(キヨシ);
            return;
          }
          z = 0;
      }
    }
  }
}
