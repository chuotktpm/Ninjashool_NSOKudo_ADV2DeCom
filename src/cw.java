public final class cw {
   private int aia;
   private int aja;
   public int aaa;
   public int aba;
   private int aka;
   private int ala;
   private int ama;
   private int ana;
   public int aca;
   public int ada;
   public int aea;
   public int afa;
   private int aoa;
   private int apa;
   public static cw aga;
   private int aqa;
   private int ara;
   private int[] asa = new int[3];
   private boolean ata;
   private boolean aua;
   private int ava;
   private int awa;
   public int aha;
   private int axa;
   private boolean aya = true;

   public final void aaa() {
      this.aia = 0;
      this.aja = 0;
      this.aaa = 0;
      this.aba = 0;
      this.aka = 0;
      this.ala = 0;
      this.ama = 0;
      this.ana = 0;
      this.aoa = 0;
      this.apa = 0;
      this.aea = 0;
      this.afa = 0;
   }

   public final void aaa(as var1, int var2, int var3, int var4, int var5) {
      var1.ada(var2, var3, var4, var5 - 1);
      var1.aaa(-var1.aba(), -var1.aca());
      var1.aaa(-this.aaa, -this.aba);
   }

   public final void aaa(as var1) {
      var1.ada(this.aca, this.ada, this.aea, this.afa - 1);
      var1.aaa(-var1.aba(), -var1.aca());
      var1.aaa(-this.aaa, -this.aba);
   }

   public final au aba() {
      cw var1;
      int var2;
      int[] var10002;
      int var3;
      int var4;
      int var5;
      byte var6;
      au var7;
      boolean var8;
      if (this.aya) {
         var1 = this;
         var2 = this.aca;
         var3 = this.ada;
         var4 = this.aea;
         var5 = this.afa;
         if (GameCanvas.ama) {
            if (!this.ata && GameCanvas.aca(var2, var3, var4, var5)) {
               for(var4 = 0; var4 < var1.asa.length; ++var4) {
                  var1.asa[0] = GameCanvas.aqa;
               }

               var1.ara = GameCanvas.aqa;
               var1.ata = true;
               var1.awa = -1;
               var1.aua = var1.ava != 0;
               var1.ava = 0;
            } else if (this.ata) {
               ++this.aqa;
               if (this.aqa > 5 && this.ara == GameCanvas.aqa && !this.aua) {
                  this.ara = -1000;
                  if (this.axa > 1) {
                     var4 = (this.aja + GameCanvas.aqa - var3) / this.aha;
                     var5 = (this.aia + GameCanvas.apa - var2) / this.aha;
                     this.awa = var4 * this.axa + var5;
                  } else {
                     this.awa = (this.aja + GameCanvas.aqa - var3) / this.aha;
                  }
               }

               if ((var4 = GameCanvas.aqa - this.asa[0]) != 0 && this.awa != -1) {
                  this.awa = -1;
               }

               for(var5 = this.asa.length - 1; var5 > 0; --var5) {
                  var10002 = var1.asa;
                  var10002[var5] = var10002[var5 - 1];
               }

               var1.asa[0] = GameCanvas.aqa;
               var1.aja -= var4;
               if (var1.aja < 0) {
                  var1.aja = 0;
               }

               if (var1.aja > var1.apa) {
                  var1.aja = var1.apa;
               }

               if (var1.aba < 0 || var1.aba > var1.apa) {
                  var4 /= 2;
               }

               var1.aba -= var4;
            }
         }

         var8 = false;
         if (GameCanvas.aoa && var1.ata) {
            var5 = GameCanvas.aqa - var1.asa[0];
            GameCanvas.aoa = false;
            if (ci.aea(var5) < 20 && ci.aea(GameCanvas.aqa - var1.ara) < 20 && !var1.aua) {
               var1.ava = 0;
               var1.aja = var1.aba;
               var1.ara = -1000;
               if (var1.axa > 1) {
                  var3 = (var1.aja + GameCanvas.aqa - var3) / var1.aha;
                  var2 = (var1.aia + GameCanvas.apa - var2) / var1.aha;
                  var1.awa = var3 * var1.axa + var2;
               } else {
                  var1.awa = (var1.aja + GameCanvas.aqa - var3) / var1.aha;
               }

               var1.aqa = 0;
               var8 = true;
            } else if (var1.awa != -1 && var1.aqa > 5) {
               var1.aqa = 0;
               var8 = true;
            } else if (var1.awa == -1 && !var1.aua) {
               if (var1.aba < 0) {
                  var1.aja = 0;
               } else if (var1.aba > var1.apa) {
                  var1.aja = var1.apa;
               } else {
                  if ((var3 = GameCanvas.aqa - var1.asa[0] + (var1.asa[0] - var1.asa[1]) + (var1.asa[1] - var1.asa[2])) > 10) {
                     var6 = 10;
                  } else if (var3 < -10) {
                     var6 = -10;
                  } else {
                     var6 = 0;
                  }

                  var1.ava = -var6 * 100;
               }
            }

            var1.ata = false;
            var1.aqa = 0;
            GameCanvas.aoa = false;
         }

         (var7 = new au()).aba = var1.awa;
         var7.aca = var8;
         var7.aaa = var1.ata;
         return var7;
      } else {
         var1 = this;
         var2 = this.aca;
         var3 = this.ada;
         var4 = this.aea;
         var5 = this.afa;
         if (GameCanvas.ama) {
            if (!this.ata && GameCanvas.aca(var2, var3, var4, var5)) {
               for(var4 = 0; var4 < var1.asa.length; ++var4) {
                  var1.asa[0] = GameCanvas.apa;
               }

               var1.ara = GameCanvas.apa;
               var1.ata = true;
               var1.awa = -1;
               var1.aua = var1.ava != 0;
               var1.ava = 0;
            } else if (this.ata) {
               ++this.aqa;
               if (this.aqa > 5 && this.ara == GameCanvas.apa && !this.aua) {
                  this.ara = -1000;
                  this.awa = (this.aia + GameCanvas.apa - var2) / this.aha;
               }

               if ((var4 = GameCanvas.apa - this.asa[0]) != 0 && this.awa != -1) {
                  this.awa = -1;
               }

               for(var5 = this.asa.length - 1; var5 > 0; --var5) {
                  var10002 = var1.asa;
                  var10002[var5] = var10002[var5 - 1];
               }

               var1.asa[0] = GameCanvas.apa;
               var1.aia -= var4;
               if (var1.aia < 0) {
                  var1.aia = 0;
               }

               if (var1.aia > var1.aoa) {
                  var1.aia = var1.aoa;
               }

               if (var1.aaa < 0 || var1.aaa > var1.aoa) {
                  var4 /= 2;
               }

               var1.aaa -= var4;
            }
         }

         var8 = false;
         if (GameCanvas.aoa && var1.ata) {
            var5 = GameCanvas.apa - var1.asa[0];
            GameCanvas.aoa = false;
            if (ci.aea(var5) < 20 && ci.aea(GameCanvas.apa - var1.ara) < 20 && !var1.aua) {
               var1.ava = 0;
               var1.aia = var1.aaa;
               var1.ara = -1000;
               var1.awa = (var1.aia + GameCanvas.apa - var2) / var1.aha;
               var1.aqa = 0;
               var8 = true;
            } else if (var1.awa != -1 && var1.aqa > 5) {
               var1.aqa = 0;
               var8 = true;
            } else if (var1.awa == -1 && !var1.aua) {
               if (var1.aaa < 0) {
                  var1.aia = 0;
               } else if (var1.aaa > var1.aoa) {
                  var1.aia = var1.aoa;
               } else {
                  if ((var3 = GameCanvas.apa - var1.asa[0] + (var1.asa[0] - var1.asa[1]) + (var1.asa[1] - var1.asa[2])) > 10) {
                     var6 = 10;
                  } else if (var3 < -10) {
                     var6 = -10;
                  } else {
                     var6 = 0;
                  }

                  var1.ava = -var6 * 100;
               }
            }

            var1.ata = false;
            var1.aqa = 0;
            GameCanvas.aoa = false;
         }

         (var7 = new au()).aba = var1.awa;
         var7.aca = var8;
         var7.aaa = var1.ata;
         return var7;
      }
   }

   public final void aca() {
      if (this.ava != 0 && !this.ata) {
         if (this.aya) {
            this.aja += this.ava / 100;
            if (this.aja < 0) {
               this.aja = 0;
            } else if (this.aja > this.apa) {
               this.aja = this.apa;
            } else {
               this.aba = this.aja;
            }
         } else {
            this.aia += this.ava / 100;
            if (this.aia < 0) {
               this.aia = 0;
            } else if (this.aia > this.aoa) {
               this.aia = this.aoa;
            } else {
               this.aaa = this.aia;
            }
         }

         this.ava = this.ava * 9 / 10;
         if (this.ava < 100 && this.ava > -100) {
            this.ava = 0;
         }
      }

      if (this.aaa != this.aia && !this.ata) {
         this.aka = this.aia - this.aaa << 2;
         this.ama += this.aka;
         this.aaa += this.ama >> 4;
         this.ama &= 15;
      }

      if (this.aba != this.aja && !this.ata) {
         this.ala = this.aja - this.aba << 2;
         this.ana += this.ala;
         this.aba += this.ana >> 4;
         this.ana &= 15;
      }

   }

   public final void aaa(int var1, int var2, int var3, int var4, int var5, int var6, boolean var7, int var8) {
      this.aca = var3;
      this.ada = var4;
      this.aha = var2;
      this.aea = var5;
      this.afa = var6;
      this.aya = var7;
      this.axa = var8;
      if (var7) {
         this.apa = var1 * var2 - var6;
      } else {
         this.aoa = var1 * var2 - var5;
      }

      if (this.apa < 0) {
         this.apa = 0;
      }

      if (this.aoa < 0) {
         this.aoa = 0;
      }

   }

   public final void aaa(int var1) {
      if (this.aya) {
         var1 -= (this.afa - this.aha) / 2;
         this.aja = var1;
         if (this.aja < 0) {
            this.aja = 0;
         }

         if (this.aja > this.apa) {
            this.aja = this.apa;
            return;
         }
      } else {
         var1 -= (this.aea - this.aha) / 2;
         this.aia = var1;
         if (this.aia < 0) {
            this.aia = 0;
         }

         if (this.aia > this.aoa) {
            this.aia = this.aoa;
         }
      }

   }

   public static void ada() {
   }

   static {
      aa.aaa(27);
      ada();
   }

   public static void aea() {
      aga = null;
   }
}
