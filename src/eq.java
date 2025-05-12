import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.TextBox;

public final class eq implements ag {
   public int aaa;
   public int aba;
   public int aca;
   public int ada;
   public boolean aea;
   private static int awa;
   private static final int[] axa;
   static int afa;
   private static String[] aya;
   private static String[] aza;
   public String aga = "";
   public String aha = "";
   String aia = "";
   String aja = "";
   String aka = "";
   int ala = 0;
   int ama = 0;
   public int ana = 500;
   int aoa = 0;
   private int baa = -1984;
   int apa = 0;
   private int bba = 0;
   int aqa = 10;
   int ara = 0;
   public static boolean asa;
   private int bca = 0;
   private static int bda;
   public boolean ata;
   public String aua = "";
   public ca ava;

   public static void aaa() {
      awa = 2;
      axa = new int[]{18, 14, 11, 9, 6, 4, 2};
      afa = 0;
      aya = new String[]{" 0", ".,@?!_1\"/$-():*+<=>;%&~#%^&*{}[];'/1", "abc2áàảãạâấầẩẫậăắằẳẵặ2", "def3đéèẻẽẹêếềểễệ3", "ghi4íìỉĩị4", "jkl5", "mno6óòỏõọôốồổỗộơớờởỡợ6", "pqrs7", "tuv8úùủũụưứừửữự8", "wxyz9ýỳỷỹỵ9", "*", "#"};
      aza = new String[]{"0", "1", "abc2", "def3", "ghi4", "jkl5", "mno6", "pqrs7", "tuv8", "wxyz9", "0", "0"};
      bda = 11;
   }

   static {
      aa.aaa(42);
      aaa();
   }

   public final void aba() {
      TextBox var1;
      (var1 = new TextBox(this.aua, "", this.ana, 0)).addCommand(new Command(er.dca, 4, 0));
      var1.addCommand(new Command("Cancel", 3, 0));
      var1.setCommandListener(new by(this, var1));

      try {
         if (this.ara == 2) {
            var1.setConstraints(65536);
         } else if (this.ara == 1) {
            var1.setConstraints(2);
         } else {
            var1.setConstraints(0);
         }
      } catch (Exception var2) {
         var2.printStackTrace();
      }

      var1.setString(this.aia);
      var1.setMaxSize(this.ana);
      Display.getDisplay(Class_ab.aja).setCurrent(var1);
   }

   public static boolean aaa(char var0) {
      return var0 >= '0' && var0 <= '9' || var0 >= 'A' && var0 <= 'Z' || var0 >= 'a' && var0 <= 'z';
   }

   public eq() {
      this.aia = "";
      afa = fw.aqa.aaa + 1;
      this.ava = new ca(er.cba, this, 1000, (Object)null);
      if (fd.ada("qwerty") == 1) {
         asa = true;
      }

   }

   public final void aca() {
      if (this.ala > 0 && this.aia.length() > 0) {
         this.aia = this.aia.substring(0, this.ala - 1) + this.aia.substring(this.ala, this.aia.length());
         --this.ala;
         this.aga();
         this.aha();
      }

   }

   private void aga() {
      if (this.ara == 2) {
         this.aka = this.aja;
      } else {
         this.aka = this.aia;
      }

      if (this.aoa < 0 && fw.aqa.aaa(this.aka) + this.aoa < this.aca - 4 - 13) {
         this.aoa = this.aca - 10 - fw.aqa.aaa(this.aka);
      }

      if (this.aoa + fw.aqa.aaa(this.aka.substring(0, this.ala)) <= 0) {
         this.aoa = -fw.aqa.aaa(this.aka.substring(0, this.ala));
         this.aoa += 40;
      } else if (this.aoa + fw.aqa.aaa(this.aka.substring(0, this.ala)) >= this.aca - 12) {
         this.aoa = this.aca - 10 - fw.aqa.aaa(this.aka.substring(0, this.ala)) - 8;
      }

      if (this.aoa > 0) {
         this.aoa = 0;
      }

   }

   private void aca(int var1) {
      if ((this.ara != 2 && this.ara != 3 || var1 >= 48 && var1 <= 57 || var1 >= 65 && var1 <= 90 || var1 >= 97 && var1 <= 122) && this.aia.length() < this.ana) {
         String var2 = this.aia.substring(0, this.ala) + (char)var1;
         if (this.ala < this.aia.length()) {
            var2 = var2 + this.aia.substring(this.ala, this.aia.length());
         }

         this.aia = var2;
         ++this.ala;
         this.aha();
         this.aga();
      }

   }

   public final boolean aaa(int var1) {
      if (var1 != 8 && var1 != -8 && var1 != 204) {
         if (var1 >= 65 && var1 <= 122 && !asa) {
            asa = true;
            fd.aaa("qwerty", 1);
         }

         if (asa) {
            if (var1 == 45) {
               if (var1 == this.baa && this.apa < axa[awa]) {
                  this.aia = this.aia.substring(0, this.ala - 1) + '_';
                  this.aka = this.aia;
                  this.aha();
                  this.aga();
                  this.baa = -1984;
                  return false;
               }

               this.baa = 45;
            }

            if (var1 >= 32) {
               this.aca(var1);
               return false;
            }
         }

         if (var1 == bda) {
            ++this.bca;
            if (this.bca > 3) {
               this.bca = 0;
            }

            this.apa = 1;
            this.baa = var1;
            return false;
         } else {
            if (var1 == 42) {
               var1 = 58;
            }

            if (var1 == 35) {
               var1 = 59;
            }

            if (var1 >= 48 && var1 <= 59) {
               if (this.ara != 0 && this.ara != 2 && this.ara != 3) {
                  if (this.ara == 1) {
                     this.aca(var1);
                     this.apa = 1;
                  }
               } else {
                  String[] var2;
                  if (this.ara != 2 && this.ara != 3) {
                     var2 = aya;
                  } else {
                     var2 = aza;
                  }

                  char var3;
                  String var4;
                  if (var1 == this.baa) {
                     this.bba = (this.bba + 1) % var2[var1 - 48].length();
                     var3 = var2[var1 - 48].charAt(this.bba);
                     if (this.bca == 0) {
                        var3 = Character.toLowerCase(var3);
                     } else if (this.bca == 1) {
                        var3 = Character.toUpperCase(var3);
                     } else if (this.bca == 2) {
                        var3 = Character.toUpperCase(var3);
                     } else {
                        var3 = var2[var1 - 48].charAt(var2[var1 - 48].length() - 1);
                     }

                     var4 = this.aia.substring(0, this.ala - 1) + var3;
                     if (this.ala < this.aia.length()) {
                        var4 = var4 + this.aia.substring(this.ala, this.aia.length());
                     }

                     this.aia = var4;
                     this.apa = axa[awa];
                     this.aha();
                  } else if (this.aia.length() < this.ana) {
                     if (this.bca == 1 && this.baa != -1984) {
                        this.bca = 0;
                     }

                     this.bba = 0;
                     var3 = var2[var1 - 48].charAt(this.bba);
                     if (this.bca == 0) {
                        var3 = Character.toLowerCase(var3);
                     } else if (this.bca == 1) {
                        var3 = Character.toUpperCase(var3);
                     } else if (this.bca == 2) {
                        var3 = Character.toUpperCase(var3);
                     } else {
                        var3 = var2[var1 - 48].charAt(var2[var1 - 48].length() - 1);
                     }

                     var4 = this.aia.substring(0, this.ala) + var3;
                     if (this.ala < this.aia.length()) {
                        var4 = var4 + this.aia.substring(this.ala, this.aia.length());
                     }

                     this.aia = var4;
                     this.apa = axa[awa];
                     ++this.ala;
                     this.aha();
                     this.aga();
                  }

                  this.baa = var1;
               }
            } else {
               this.bba = 0;
               this.baa = -1984;
               if (var1 == 14) {
                  if (this.ala > 0) {
                     --this.ala;
                     this.aga();
                     this.aqa = 10;
                     return false;
                  }
               } else if (var1 == 15) {
                  if (this.ala < this.aia.length()) {
                     ++this.ala;
                     this.aga();
                     this.aqa = 10;
                     return false;
                  }
               } else {
                  if (var1 == 19) {
                     this.aca();
                     return false;
                  }

                  this.baa = var1;
               }
            }

            return true;
         }
      } else {
         this.aca();
         return true;
      }
   }

   public final void aaa(as var1) {
      var1.ada(0, 0, ab.aza, ab.baa);
      boolean var2 = this.aea;
      if (this.ara == 2) {
         this.aka = this.aja;
      } else {
         this.aka = this.aia;
      }

      if (this.aka.equals("")) {
         this.aka = this.aha;
      }

      fk.aaa(var1, var2, this.aaa, this.aba, this.aca, this.ada, 4 + this.aoa + this.aaa, this.aba + (this.ada - fw.aqa.aaa) / 2, this.aka);
      var1.ada(this.aaa + 3, this.aba + 1, this.aca - 4, this.ada - 4);
      var1.aaa(0);
      if (this.aea && this.apa == 0 && (this.aqa > 0 || this.ama / 5 % 2 == 0)) {
         var1.aaa(11184810);
         var1.aca(5 + this.aoa + this.aaa + fw.aqa.aaa(this.aka.substring(0, this.ala)) - 1, this.aba + (this.ada - afa) / 2 + 1, 1, afa);
      }

   }

   private void aba(as var1) {
      boolean var2 = this.aea;
      if (this.ara == 2) {
         this.aka = this.aja;
      } else {
         this.aka = this.aia;
      }

      if (this.aka.equals("")) {
         this.aka = this.aha;
      }

      fk.aaa(var1, var2, this.aaa, this.aba, this.aca, 4 + this.aoa + this.aaa, this.aba + (this.ada - fw.aqa.aaa) / 2, this.aka);
      var1.aaa(0);
      if (this.aea && this.apa == 0 && (this.aqa > 0 || this.ama / 5 % 2 == 0)) {
         var1.aaa(11184810);
         var1.aca(5 + this.aoa + this.aaa + fw.aqa.aaa(this.aka.substring(0, this.ala)) - 1, this.aba + (this.ada - afa) / 2 + 1, 1, afa);
      }

   }

   private void aha() {
      if (this.ara == 2) {
         this.aja = "";

         for(int var1 = 0; var1 < this.aia.length(); ++var1) {
            this.aja = this.aja + "*";
         }

         if (this.apa > 0 && this.ala > 0) {
            this.aja = this.aja.substring(0, this.ala - 1) + this.aia.charAt(this.ala - 1) + this.aja.substring(this.ala, this.aja.length());
         }
      }

   }

   public final void ada() {
      ++this.ama;
      if (this.apa > 0) {
         --this.apa;
         if (this.apa == 0) {
            this.bba = 0;
            if (this.bca == 1 && this.baa != bda) {
               this.bca = 0;
            }

            this.baa = -1984;
            this.aha();
         }
      }

      if (this.aqa > 0) {
         --this.aqa;
      }

      if (ab.aoa) {
         if (ab.bda == dl.aaa) {
            if (dl.aaa == null) {
               dl.aaa = new dl();
            }

            int var1 = dl.aaa.aba.aba;
            if (!ab.aba(this.aaa, this.aba - var1, this.aca, this.ada)) {
               this.aea = false;
               return;
            }

            this.aba();
            return;
         }

         if (ab.aba(this.aaa, this.aba, this.aca, this.ada)) {
            this.aba();
            return;
         }

         this.aea = false;
      }

   }

   public final String aea() {
      return this.aia;
   }

   public final void aaa(String var1) {
      if (var1 != null) {
         this.baa = -1984;
         this.apa = 0;
         this.bba = 0;
         this.aia = var1;
         this.aka = var1;
         this.aha();
         this.ala = var1.length();
         this.aga();
      }

   }

   public final void aba(int var1) {
      this.ana = var1;
   }

   private void ada(int var1) {
      this.ara = var1;
   }

   public final void aaa(int var1, Object var2) {
      switch(var1) {
      case 1000:
         this.aca();
      default:
      }
   }

   public static void afa() {
      awa = 0;
      axa = null;
      afa = 0;
      aya = null;
      aza = null;
      asa = false;
      bda = 0;
   }
}
