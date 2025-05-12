import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;
import javax.microedition.lcdui.Image;

public final class gg {
   public gh aaa;
   public ev aba;
   public int aca;
   public int ada;
   public int aea;
   public long afa;
   public boolean aga;
   public int aha;
   public int aia;
   public int aja;
   public int aka;
   public int ala;
   public int ama;
   public int ana;
   public boolean aoa;
   public fx apa;
   public int aqa;
   public Image ara;
   public boolean asa = false;
   public long ata = 0L;
   private long aya;
   public boolean aua = false;
   public boolean ava = false;
   public int awa = 0;
   public long axa = 0L;

   public final gg aaa() {
      gg var1;
      (var1 = new gg()).aaa = this.aaa;
      if (this.aba != null) {
         var1.aba = new ev();

         for(int var2 = 0; var2 < this.aba.size(); ++var2) {
            bq var3;
            (var3 = new bq()).aca = ((bq)this.aba.elementAt(var2)).aca;
            var3.aaa = ((bq)this.aba.elementAt(var2)).aaa;
            var1.aba.addElement(var3);
         }
      }

      var1.aca = this.aca;
      var1.ada = this.ada;
      var1.aea = this.aea;
      var1.afa = this.afa;
      var1.aga = this.aga;
      var1.aha = this.aha;
      var1.aia = this.aia;
      var1.aja = this.aja;
      var1.aka = this.aka;
      var1.ala = this.ala;
      var1.ama = this.ama;
      var1.ana = this.ana;
      var1.aoa = this.aoa;
      return var1;
   }

   public final gg aaa(int var1) {
      gg var2;
      (var2 = this.aaa()).aga = true;
      int var3;
      if ((var3 = var1 - var2.aia) == 0) {
         return var2;
      } else {
         var2.aia = var1;
         if (var2.aba != null) {
            for(var1 = 0; var1 < var2.aba.size(); ++var1) {
               bq var4;
               if ((var4 = (bq)var2.aba.elementAt(var1)).aca.aaa != 6 && var4.aca.aaa != 7) {
                  if (var4.aca.aaa != 8 && var4.aca.aaa != 9 && var4.aca.aaa != 19) {
                     if (var4.aca.aaa != 10 && var4.aca.aaa != 11 && var4.aca.aaa != 12 && var4.aca.aaa != 13 && var4.aca.aaa != 14 && var4.aca.aaa != 15 && var4.aca.aaa != 17 && var4.aca.aaa != 18 && var4.aca.aaa != 20) {
                        if (var4.aca.aaa != 21 && var4.aca.aaa != 22 && var4.aca.aaa != 23 && var4.aca.aaa != 24 && var4.aca.aaa != 25 && var4.aca.aaa != 26) {
                           if (var4.aca.aaa == 16) {
                              var4.aaa += var3 * 3;
                           }
                        } else {
                           var4.aaa += var3 * 150;
                        }
                     } else {
                        var4.aaa += var3 * 5;
                     }
                  } else {
                     var4.aaa += var3 * 10;
                  }
               } else {
                  var4.aaa += var3 * 15;
               }
            }
         }

         return var2;
      }
   }

   public final boolean aba() {
      return this.aaa.aba >= 0 && this.aaa.aba <= 15;
   }

   public final boolean aca() {
      return 29 <= this.aaa.aba && this.aaa.aba <= 33;
   }

   public final boolean ada() {
      return this.aaa.aba == 34;
   }

   public final String aea() {
      if (this.afa <= 0L) {
         return er.fpa;
      } else {
         Calendar var1;
         (var1 = Calendar.getInstance()).setTimeZone(TimeZone.getTimeZone("GMT+7"));
         var1.setTime(new Date(this.afa));
         int var2 = var1.get(11);
         int var3 = var1.get(12);
         int var4 = var1.get(5);
         int var5 = var1.get(2) + 1;
         int var6 = var1.get(1);
         return var4 + "/" + var5 + "/" + var6 + " " + var2 + "h" + var3 + "'";
      }
   }

   public final String afa() {
      if (this.afa <= 0L) {
         return er.fpa;
      } else if (this.afa / 1000L >= 2592000L) {
         return this.afa / 1000L / 2592000L + " " + er.lxa;
      } else if (this.afa / 1000L >= 604800L) {
         return this.afa / 1000L / 604800L + " " + er.lya;
      } else if (this.afa / 1000L >= 86400L) {
         return this.afa / 1000L / 86400L + " " + er.lza;
      } else if (this.afa / 1000L >= 3600L) {
         return this.afa / 1000L / 3600L + " " + er.maa;
      } else {
         return this.afa / 1000L >= 60L ? this.afa / 1000L / 60L + " " + er.mca : "";
      }
   }

   public final void aga() {
      if (!this.aca()) {
         this.afa = 0L;
      }

   }

   public final boolean aha() {
      return this.ana == 5 || this.ana == 3 || this.ana == 4 || this.ana == 39;
   }

   public final boolean aia() {
      return this.aja() || this.ala() || this.ama() || this.ana() || this.aoa();
   }

   public final boolean aja() {
      return this.ana == 20 || this.ana == 21 || this.ana == 22 || this.ana == 23 || this.ana == 24 || this.ana == 25 || this.ana == 26 || this.ana == 27 || this.ana == 28 || this.ana == 29 || this.ana == 16 || this.ana == 17 || this.ana == 18 || this.ana == 19 || this.ana == 2 || this.ana == 6 || this.ana == 8 || this.ana == 34;
   }

   public final boolean aka() {
      return this.ana == 7 || this.ana == 9;
   }

   public final boolean ala() {
      return this.ana == 14;
   }

   public final boolean ama() {
      return this.ana == 15;
   }

   public final boolean ana() {
      return this.ana == 32;
   }

   public final boolean aoa() {
      return this.ana == 34;
   }

   public final boolean apa() {
      return this.aqa() == this.aia;
   }

   public final int aqa() {
      if (this.aaa.afa > 0 && this.aaa.afa < 20) {
         return 4;
      } else if (this.aaa.afa >= 20 && this.aaa.afa < 40) {
         return 8;
      } else if (this.aaa.afa >= 40 && this.aaa.afa < 50) {
         return 12;
      } else {
         return this.aaa.afa >= 50 && this.aaa.afa < 60 ? 14 : 16;
      }
   }

   public final boolean ara() {
      return this.aaa.aba == 0 || this.aaa.aba == 2 || this.aaa.aba == 4 || this.aaa.aba == 6 || this.aaa.aba == 8;
   }

   public final boolean asa() {
      return this.aaa.aba == 3 || this.aaa.aba == 5 || this.aaa.aba == 7 || this.aaa.aba == 9;
   }

   public final boolean ata() {
      return this.aaa.aba == 1;
   }

   public final int aua() {
      if (this.aba != null) {
         for(int var1 = 0; var1 < this.aba.size(); ++var1) {
            bq var2;
            if ((var2 = (bq)this.aba.elementAt(var1)) != null && var2.aca.aaa == 85) {
               return var2.aaa;
            }
         }
      }

      return -1;
   }

   public final boolean aba(int var1) {
      if (this.aba != null) {
         for(int var2 = 0; var2 < this.aba.size(); ++var2) {
            bq var3;
            if ((var3 = (bq)this.aba.elementAt(var2)) != null && var3.aca.aaa == var1) {
               return true;
            }
         }
      }

      return false;
   }

   public final int aca(int var1) {
      int var2 = 0;
      if (this.aba != null) {
         for(int var3 = 0; var3 < this.aba.size(); ++var3) {
            bq var4;
            if ((var4 = (bq)this.aba.elementAt(var3)) != null && var4.aca.aca == var1) {
               ++var2;
            }
         }
      }

      return var2;
   }
}
