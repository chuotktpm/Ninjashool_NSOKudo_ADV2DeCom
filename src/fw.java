import java.io.DataInputStream;
import java.io.IOException;
import javax.microedition.lcdui.Image;

public final class fw {
   private int awa;
   int aaa;
   Image aba;
   private String axa;
   private int[][] aya;
   private static String aza;
   public static fw aca;
   public static fw ada;
   public static fw aea;
   public static fw afa;
   public static fw aga;
   public static fw aha;
   public static fw aia;
   public static fw aja;
   public static fw aka;
   public static fw ala;
   public static fw ama;
   public static fw ana;
   public static fw aoa;
   public static fw apa;
   public static fw aqa;
   public static fw ara;
   public static fw asa;
   public static fw ata;
   public static fw aua;
   public static fw ava;
   private String baa;

   public static void aaa() {
      aza = " 0123456789+-*='_?.,<>/[]{}!@#$%^&*():aáàảãạâấầẩẫậăắằẳẵặbcdđeéèẻẽẹêếềểễệfghiíìỉĩịjklmnoóòỏõọôốồổỗộơớờởỡợpqrstuúùủũụưứừửữựvxyýỳỷỹỵzwAÁÀẢÃẠĂẰẮẲẴẶÂẤẦẨẪẬBCDĐEÉÈẺẼẸÊẾỀỂỄỆFGHIÍÌỈĨỊJKLMNOÓÒỎÕỌÔỐỒỔỖỘƠỚỜỞỠỢPQRSTUÚÙỦŨỤƯỨỪỬỮỰVXYÝỲỶỸỴZW";
      aca = new fw(aza, "/font/tahoma_7b_red.png", "/font/tahoma_7b", 0);
      ada = new fw(aza, "/font/tahoma_7b_blue.png", "/font/tahoma_7b", 0);
      aea = new fw(aza, "/font/tahoma_7b_purple.png", "/font/tahoma_7b", 0);
      afa = new fw(aza, "/font/tahoma_7b_yellow.png", "/font/tahoma_7b", 0);
      aga = new fw(aza, "/font/tahoma_7b_white.png", "/font/tahoma_7b", 0);
      aha = new fw(aza, "/font/tahoma_7b_green.png", "/font/tahoma_7b", 0);
      aia = new fw(aza, "/font/tahoma_7.png", "/font/tahoma_7", 0);
      aja = new fw(aza, "/font/tahoma_7_blue1.png", "/font/tahoma_7", 0);
      aka = new fw(aza, "/font/tahoma_7_white.png", "/font/tahoma_7", 0);
      ala = new fw(aza, "/font/tahoma_7_yellow.png", "/font/tahoma_7", 0);
      ama = new fw(aza, "/font/tahoma_7_grey.png", "/font/tahoma_7", 0);
      ana = new fw(aza, "/font/tahoma_7_red.png", "/font/tahoma_7", 0);
      aoa = new fw(aza, "/font/tahoma_7_blue.png", "/font/tahoma_7", 0);
      apa = new fw(aza, "/font/tahoma_7_green.png", "/font/tahoma_7", 0);
      aqa = new fw(aza, "/font/tahoma_8b.png", "/font/tahoma_8b", -1);
      ara = new fw(" 0123456789+-", "/font/number_yellow.png", "/font/number", 0);
      asa = new fw(" 0123456789+-", "/font/number_red.png", "/font/number", 0);
      ata = new fw(" 0123456789+-", "/font/number_green.png", "/font/number", 0);
      aua = new fw(" 0123456789+-", "/font/number_white.png", "/font/number", 0);
      ava = new fw(" 0123456789+-", "/font/number_orange.png", "/font/number", 0);
   }

   static {
      aa.aaa(59);
      aaa();
   }

   private fw(String var1, String var2, String var3, int var4) {
      try {
         this.axa = var1;
         this.awa = var4;
         this.baa = var2;
         var1 = null;
         this.aba();

         try {
            DataInputStream var8 = new DataInputStream(this.getClass().getResourceAsStream(var3));
            this.aya = new int[var8.readShort()][];

            for(int var9 = 0; var9 < this.aya.length; ++var9) {
               this.aya[var9] = new int[4];
               this.aya[var9][0] = var8.readShort();
               this.aya[var9][1] = var8.readShort();
               this.aya[var9][2] = var8.readShort();
               this.aya[var9][3] = var8.readShort();
               int var10 = this.aya[var9][3];
               this.aaa = var10;
            }

         } catch (Exception var6) {
            try {
               var1.close();
            } catch (IOException var5) {
               var5.printStackTrace();
            }
         }
      } catch (Exception var7) {
         var7.printStackTrace();
      }
   }

   public final void aba() {
      this.aba = ab.aca(this.baa);
   }

   private void ada() {
      this.aba = null;
   }

   private int aea() {
      return this.aaa;
   }

   public final int aaa(String var1) {
      int var2 = 0;

      for(int var3 = 0; var3 < var1.length(); ++var3) {
         int var4;
         if ((var4 = this.axa.indexOf(var1.charAt(var3))) == -1) {
            var4 = 0;
         }

         var2 += this.aya[var4][2] + this.awa;
      }

      return var2;
   }

   public final void aaa(as var1, String var2, int var3, int var4, int var5) {
      int var6 = var2.length();
      if (var5 == 0) {
         var5 = var3;
      } else if (var5 == 1) {
         var5 = var3 - this.aaa(var2);
      } else {
         var5 = var3 - (this.aaa(var2) >> 1);
      }

      for(int var7 = 0; var7 < var6; ++var7) {
         if ((var3 = this.axa.indexOf(var2.charAt(var7))) == -1) {
            var3 = 0;
         }

         if (var3 >= 0) {
            var1.aaa(this.aba, this.aya[var3][0], this.aya[var3][1], this.aya[var3][2], this.aya[var3][3], 0, var5, var4, 20);
         }

         var5 += this.aya[var3][2] + this.awa;
      }

   }

   public final void aaa(as var1, String var2, int var3, int var4, int var5, fw var6) {
      int var7 = var2.length();
      if (var5 == 0) {
         var5 = var3;
      } else if (var5 == 1) {
         var5 = var3 - this.aaa(var2);
      } else {
         var5 = var3 - (this.aaa(var2) >> 1);
      }

      for(int var8 = 0; var8 < var7; ++var8) {
         if ((var3 = this.axa.indexOf(var2.charAt(var8))) == -1) {
            var3 = 0;
         }

         if (var3 >= 0) {
            var1.aaa(var6.aba, this.aya[var3][0], this.aya[var3][1], this.aya[var3][2], this.aya[var3][3], 0, var5 + 1, var4, 20);
            var1.aaa(var6.aba, this.aya[var3][0], this.aya[var3][1], this.aya[var3][2], this.aya[var3][3], 0, var5, var4 + 1, 20);
            var1.aaa(this.aba, this.aya[var3][0], this.aya[var3][1], this.aya[var3][2], this.aya[var3][3], 0, var5, var4, 20);
         }

         var5 += this.aya[var3][2] + this.awa;
      }

   }

   public final ev aaa(String var1, int var2) {
      ev var3 = new ev();
      String var4 = "";

      for(int var5 = 0; var5 < var1.length(); ++var5) {
         if (var1.charAt(var5) == '\n') {
            var3.addElement(var4);
            var4 = "";
         } else {
            var4 = var4 + var1.charAt(var5);
            if (this.aaa(var4) > var2) {
               int var6;
               for(var6 = var4.length() - 1; var6 >= 0 && var4.charAt(var6) != ' '; --var6) {
               }

               if (var6 < 0) {
                  var6 = var4.length() - 1;
               }

               var3.addElement(var4.substring(0, var6));
               var5 = var5 - (var4.length() - var6) + 1;
               var4 = "";
            }

            if (var5 == var1.length() - 1 && !var4.trim().equals("")) {
               var3.addElement(var4);
            }
         }
      }

      return var3;
   }

   public final String[] aba(String var1, int var2) {
      ev var4;
      String[] var5 = new String[(var4 = this.aaa(var1, var2)).size()];

      for(int var3 = 0; var3 < var4.size(); ++var3) {
         var5[var3] = var4.elementAt(var3).toString();
      }

      return var5;
   }

   public static void aca() {
      aza = null;
      aca = null;
      ada = null;
      aea = null;
      afa = null;
      aga = null;
      aha = null;
      aia = null;
      aja = null;
      aka = null;
      ala = null;
      ama = null;
      ana = null;
      aoa = null;
      apa = null;
      aqa = null;
      ara = null;
      asa = null;
      ata = null;
      aua = null;
      ava = null;
   }
}
