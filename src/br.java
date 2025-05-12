public final class br {
   int aaa;
   int aba;
   int aca;
   int ada;
   private int aja;
   private int aka;
   private int ala;
   private int ama;
   private int ana = 28;
   private int aoa;
   private int apa;
   private int aqa;
   private int ara;
   private int asa;
   private boolean ata = false;
   public static boolean aea;
   public static String afa;
   public static String aga;
   public static int aha;
   public static boolean aia;

   private static boolean afa() {
      if (fz.ala().aqa != 3) {
         for(int var0 = 2; var0 > 0; --var0) {
            int var1;
            try {
               if (ci.aea(ab.ata[var0].aaa - ab.ata[var0 - 1].aaa) <= 2) {
                  continue;
               }

               var1 = ci.aea(ab.ata[var0].aba - ab.ata[var0 - 1].aba);
            } catch (Exception var2) {
               var2.printStackTrace();
               return true;
            }

            if (var1 > 2) {
               return false;
            }
         }
      }

      return true;
   }

   private static void aga() {
      ab.ala[1] = false;
      ab.ala[2] = false;
      ab.ala[3] = false;
      ab.ala[4] = false;
      ab.ala[6] = false;
   }

   public final void aaa() {
      if (ab.ama && !ab.aoa) {
         this.aja = ab.ara;
         this.aka = ab.asa;
         if (this.aja <= (ab.aza >> 1) - 100 && this.aka >= ab.baa >> 1) {
            if (!this.ata) {
               this.aaa = this.aca = this.aja;
               this.aba = this.ada = this.aka;
            }

            this.ata = true;
            this.apa = ab.apa - this.aaa;
            this.aqa = ab.aqa - this.aba;
            this.ara = this.apa * this.apa + this.aqa * this.aqa;
            this.aoa = ci.afa(this.ara);
            if (Math.abs(this.apa) > 4 || Math.abs(this.aqa) > 4) {
               this.asa = ci.aaa(this.apa, this.aqa);
               if (!ab.aba(this.aaa - this.ana, this.aba - this.ana, this.ana << 1, this.ana << 1)) {
                  if (this.aoa != 0) {
                     this.ada = this.aqa * this.ana / this.aoa;
                     this.aca = this.apa * this.ana / this.aoa;
                     this.aca += this.aaa;
                     this.ada += this.aba;
                     if (!ci.aaa(this.aaa - this.ana, this.aba - this.ana, this.ana << 1, this.ana << 1, this.aca, this.ada)) {
                        this.aca = this.ala;
                        this.ada = this.ama;
                     } else {
                        this.ala = this.aca;
                        this.ama = this.ada;
                     }
                  } else {
                     this.aca = this.ala;
                     this.ada = this.ama;
                  }
               } else {
                  this.aca = ab.apa;
                  this.ada = ab.aqa;
               }

               aga();
               if (!afa()) {
                  aga();
                  return;
               }

               if (this.asa <= 360 && this.asa > 340 || this.asa > 0 && this.asa <= 90) {
                  gf.fza = 0;
                  ab.ala[6] = true;
                  ab.aka[6] = true;
                  return;
               }

               if (this.asa > 290 && this.asa <= 340) {
                  gf.fza = 0;
                  ab.ala[3] = true;
                  ab.aka[3] = true;
                  return;
               }

               if (this.asa > 250 && this.asa <= 290) {
                  gf.fza = 0;
                  ab.ala[2] = true;
                  ab.aka[2] = true;
                  return;
               }

               if (this.asa > 200 && this.asa <= 250) {
                  gf.fza = 0;
                  ab.ala[1] = true;
                  ab.aka[1] = true;
                  return;
               }

               if (this.asa > 90 && this.asa <= 200) {
                  gf.fza = 0;
                  ab.ala[4] = true;
                  ab.aka[4] = true;
                  return;
               }
            }
         }
      } else {
         this.aaa = this.aca = 50;
         this.aba = this.ada = ab.baa - 50;
         this.ata = false;
         aga();
      }

   }

   public static void aaa(String var0, String var1, int var2) {
      if (var0 != null) {
         aea = true;
         afa = var0;
         aga = var1;
         aha = var2;
      }

   }

   public static void aba() {
      aaa(er.bda, (String)null, 5000);
      aia = true;
   }

   public static void aaa(String var0) {
      aaa(var0, (String)null, 5000);
      aia = true;
   }

   private static void aaa(as var0) {
      String var1 = afa;
      if (gn.aja != null) {
         var1 = gn.aja;
      }

      if (aea && (!aia || aha <= 4990) && !gf.dla) {
         fk.aaa(ab.bba - 64, 10, 128, 40, var0);
         if (aia) {
            ab.aaa(ab.bba - fw.aqa.aaa(var1) / 2 - 10, 30, var0);
            fw.aqa.aaa(var0, var1, ab.bba + 5, 23, 2);
            return;
         }

         if (aga != null) {
            fw.aqa.aaa(var0, var1, ab.bba, 18, 2);
            fw.aka.aaa(var0, aga, ab.bba, 32, 2);
            return;
         }

         fw.aqa.aaa(var0, var1, ab.bba, 23, 2);
      }

   }

   private static void aha() {
      if (aha > 0 && --aha == 0) {
         aca();
      }

   }

   public static void aca() {
      afa = "";
      aga = null;
      aia = false;
      aha = 0;
      aea = false;
   }

   public static void ada() {
   }

   static {
      aa.aaa(13);
      ada();
   }

   public static void aea() {
      aea = false;
      afa = null;
      aga = null;
      aha = 0;
      aia = false;
   }
}
