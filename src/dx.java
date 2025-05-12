import java.util.Vector;

public final class dx extends cu {
   private int aaa;
   private int aba;
   private int aga;
   private short aha = 256;
   private int aia;
   private int aja;
   private int aka;
   private int ala;
   private int ama;
   private int ana;
   private fz aoa;
   private fn apa;
   private boolean aqa;
   private int ara;
   private int asa = 1;
   private static int ata;
   private static Vector aua;
   private static int ava;
   private int awa = 0;
   private int axa;
   private static byte[] aya;
   private static int[] aza;
   private static int[] baa;

   public static void aaa() {
      aua = new Vector();
      ava = 0;
      aya = new byte[]{0, 1, 2, 1, 0, 1, 2, 1, 0, 1, 2, 1, 0, 1, 2, 1, 0, 1, 2, 1, 0, 1, 2, 1, 0};
      aza = new int[]{0, 0, 0, 7, 6, 6, 6, 2, 2, 3, 3, 4, 5, 5, 5, 1};
      baa = new int[]{0, 15, 37, 52, 75, 105, 127, 142, 165, 195, 217, 232, 255, 285, 307, 322, 345, 370};
   }

   static {
      aa.aaa(33);
      aaa();
   }

   private void aaa(int var1) {
      this.aaa = var1;
      this.aba = this.aha * ci.aba(var1) >> 10;
      this.aga = this.aha * ci.aaa(var1) >> 10;
   }

   public static void aaa(int var0, int var1, boolean var2, short var3, int var4, int var5, int var6, fz var7) {
      ata = var3;
      cu.aca.addElement(new dx(var0, var1, var2, var4, var5, var6, var7));
   }

   public static void aaa(int var0, int var1, fn var2) {
      cu.aca.addElement(new dx(var0, var1, var2));
   }

   private dx(int var1, int var2, boolean var3, int var4, int var5, int var6, fz var7) {
      this.ana = 0;
      this.aia = var1;
      this.aja = var2;
      this.aqa = var3;
      this.ara = var4;
      this.ala = var5;
      this.ama = var6;
      this.aoa = var7;
      if (var3) {
         this.aaa(this.asa * 90);
         ++this.asa;
         if (this.asa > 3) {
            this.asa = 1;
            return;
         }
      } else {
         if (var1 > var7.ala) {
            this.aaa(240);
            return;
         }

         this.aaa(300);
      }

   }

   private dx(int var1, int var2, fn var3) {
      this.ana = 1;
      this.aia = var1;
      this.aja = var2;
      this.apa = var3;
      if (var1 > var3.aaa) {
         this.aaa(240);
      } else {
         this.aaa(300);
      }

      this.aha = 256;
      this.aaa = 180;
      this.aba = this.aha * ci.aba(this.aaa) >> 10;
      this.aga = this.aha * ci.aaa(this.aaa) >> 10;
   }

   public final void aba() {
      eb var1;
      if (ata > 100) {
         var1 = new eb(this.aia, this.aja, 2);
         aua.addElement(var1);
      } else if (ata > 50 && ata <= 100) {
         var1 = new eb(this.aia, this.aja, 5);
         aua.addElement(var1);
      } else if (ata > 30 && ata <= 50) {
         var1 = new eb(this.aia, this.aja, 4);
         aua.addElement(var1);
      } else if (ata > 0 && ata <= 30) {
         var1 = new eb(this.aia, this.aja, 3);
         aua.addElement(var1);
      }

      int var2;
      int var3;
      int var4;
      if (this.aoa != null) {
         var4 = this.aoa.ala - this.aia;
         var2 = this.aoa.ama - (this.aoa.cja >> 1) - this.aja;
         ++this.aka;
         if ((ci.aea(var4) >= 16 || ci.aea(var2) >= 16) && this.aka <= 60) {
            if (Math.abs((var3 = ci.aaa(var4, var2)) - this.aaa) < 90 || var4 * var4 + var2 * var2 > 4096) {
               if (Math.abs(var3 - this.aaa) < 15) {
                  this.aaa = var3;
               } else if ((var3 - this.aaa < 0 || var3 - this.aaa >= 180) && var3 - this.aaa >= -180) {
                  this.aaa = ci.aca(this.aaa - 15);
               } else {
                  this.aaa = ci.aca(this.aaa + 15);
               }
            }

            if (this.aha < 8192) {
               this.aha = (short)(this.aha + 1024);
            }

            this.aba = this.aha * ci.aba(this.aaa) >> 10;
            this.aga = this.aha * ci.aaa(this.aaa) >> 10;
            var4 = var4 + this.aba >> 10;
            this.aia += var4;
            var2 = var2 + this.aga >> 10;
            this.aja += var2;
            var4 = ci.aaa(var4, -var2);
            var2 = 0;

            while(true) {
               if (var2 >= baa.length - 1) {
                  var4 = 0;
                  break;
               }

               if (var4 >= baa[var2] && var4 <= baa[var2 + 1]) {
                  var4 = var2 >= 16 ? 0 : var2;
                  break;
               }

               ++var2;
            }

            this.axa = var4;
            this.awa = aya[this.axa];
            ava = aza[this.axa];
         }
      }

      var3 = 0;
      var4 = 0;
      if (this.ana != 0) {
         if (this.ana == 1) {
            var3 = this.apa.aaa - this.aia;
            var4 = this.apa.aba - 10 - this.aja;
            ++this.aka;
            if (ci.aea(var3) < 16 && ci.aea(var4) < 16 || this.aka > 60) {
               this.apa.ada = true;
               cu.aca.removeElement(this);
               return;
            }
         }
      } else {
         var3 = this.aoa.ala - this.aia;
         var4 = this.aoa.ama - 10 - this.aja;
         ++this.aka;
         if (this.aoa.aqa == 5 || this.aoa.aqa == 14) {
            this.aia += (this.aoa.ala - this.aia) / 2;
            this.aja += (this.aoa.ama - this.aja) / 2;
         }

         if (ci.aea(var3) < 16 && ci.aea(var4) < 16 || this.aka > 60) {
            this.aoa.aaa(this.ala, this.ama, this.aqa, this.ara);
            cu.aca.removeElement(this);
            return;
         }
      }

      if (Math.abs((var2 = ci.aaa(var3, var4)) - this.aaa) < 90 || var3 * var3 + var4 * var4 > 4096) {
         if (Math.abs(var2 - this.aaa) < 15) {
            this.aaa = var2;
         } else if ((var2 - this.aaa < 0 || var2 - this.aaa >= 180) && var2 - this.aaa >= -180) {
            this.aaa = ci.aca(this.aaa - 15);
         } else {
            this.aaa = ci.aca(this.aaa + 15);
         }
      }

      var3 = var3 + this.aba >> 10;
      this.aia += var3;
      var3 = var4 + this.aga >> 10;
      this.aja += var3;

      for(var3 = 0; var3 < aua.size(); ++var3) {
         (var1 = (eb)aua.elementAt(var3)).aaa();
         if (var1.aaa > 3) {
            aua.removeElementAt(var3);
         }
      }

   }

   public final void aaa(as var1) {
      int var2;
      if (this.aqa) {
         var2 = ab.aua % 7;
         if (this.ara == 114) {
            if (var2 < 4) {
               fo.aaa(var1, 1299, this.aia, this.aja, 0, 3);
               return;
            }

            fo.aaa(var1, 1307, this.aia, this.aja, 0, 3);
            return;
         }

         if (this.ara == 115) {
            if ((var2 = ab.aua % 20) < 4) {
               fo.aaa(var1, 1379, this.aia, this.aja, 0, 3);
               return;
            }

            if (var2 < 8) {
               fo.aaa(var1, 1380, this.aia, this.aja, 0, 3);
               return;
            }

            if (var2 < 12) {
               fo.aaa(var1, 1379, this.aia, this.aja, 0, 3);
               return;
            }

            if (var2 < 16) {
               fo.aaa(var1, 1382, this.aia, this.aja, 0, 3);
               return;
            }
         } else if (this.ara == 116) {
            if ((var2 = ab.aua % 17) < 4) {
               fo.aaa(var1, 1399, this.aia, this.aja, 0, 3);
               return;
            }

            if (var2 < 8) {
               fo.aaa(var1, 1400, this.aia, this.aja, 0, 3);
               return;
            }

            if (var2 < 12) {
               fo.aaa(var1, 1401, this.aia, this.aja, 0, 3);
               return;
            }

            if (var2 < 16) {
               fo.aaa(var1, 1402, this.aia, this.aja, 0, 3);
               return;
            }
         } else if (this.ara == 139) {
            if ((var2 = ab.aua % 20) < 4) {
               fo.aaa(var1, 1459, this.aia, this.aja, 0, 3);
               return;
            }

            if (var2 < 8) {
               fo.aaa(var1, 1380, this.aia, this.aja, 0, 3);
               return;
            }

            if (var2 < 12) {
               fo.aaa(var1, 1461, this.aia, this.aja, 0, 3);
               return;
            }

            if (var2 < 16) {
               fo.aaa(var1, 1382, this.aia, this.aja, 0, 3);
               return;
            }
         } else if (this.ara == 144 || this.ara == 163) {
            if ((var2 = ab.aua % 20) < 4) {
               fo.aaa(var1, 1459, this.aia, this.aja, 0, 3);
               return;
            }

            if (var2 < 8) {
               fo.aaa(var1, 1380, this.aia, this.aja, 0, 3);
               return;
            }

            if (var2 < 12) {
               fo.aaa(var1, 1461, this.aia, this.aja, 0, 3);
               return;
            }

            if (var2 < 16) {
               fo.aaa(var1, 1382, this.aia, this.aja, 0, 3);
               return;
            }
         }
      } else {
         if (ata > 100) {
            var1.aaa(gf.fpa, 0, this.awa * 23, 31, 23, ava, this.aia, this.aja, 0);
         } else if (ata > 50 && ata <= 100) {
            var1.aaa(gf.fpa, 0, 0, 14, 14, ava, this.aia, this.aja, 0);
         } else if (ata > 30 && ata <= 50) {
            var1.aaa(gf.fpa, 0, 0, 8, 8, ava, this.aia, this.aja, 0);
         } else if (ata > 0 && ata <= 30) {
            var1.aaa(gf.fpa, 0, 0, 8, 8, ava, this.aia, this.aja, 0);
         }

         for(var2 = 0; var2 < aua.size(); ++var2) {
            eb var3;
            if ((var3 = (eb)aua.elementAt(var2)) != null) {
               var3.aaa(var1);
            }
         }
      }

   }

   public static void aca() {
      ata = 0;
      aua = null;
      ava = 0;
      aya = null;
      aza = null;
      baa = null;
   }
}
