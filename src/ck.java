import javax.microedition.lcdui.Image;

public final class ck implements ag {
   public boolean aaa;
   public ev aba;
   public int aca;
   public int ada;
   public int aea;
   public int afa;
   public int aga;
   public int aha;
   public static int aia;
   public static int aja;
   public static int aka;
   public static int ala;
   public ca ama;
   public ca ana;
   public ca aoa;
   public static Image apa;
   public static Image aqa;
   public boolean ara;
   public int asa;
   public int ata;
   public int aua;
   public int[] ava;
   public boolean awa;
   public boolean axa;
   public int aya;
   public int aza;
   public int baa;
   public int bba;

   public static void aaa() {
      apa = GameCanvas.aca("/hd/btnlBig0.png");
      aqa = GameCanvas.aca("/hd/btnlBig1.png");
   }

   static {
      aa.aaa(20);
      aaa();
   }

   public ck() {
      this.ama = new ca(er.eta, 0);
      this.ana = GameCanvas.afa ? null : new ca(er.bma, GameCanvas.aza - 71, GameCanvas.baa - fb.aqa + 1);
      this.aoa = null;
      this.ava = new int[3];
   }

   public final void aaa(ev var1) {
      this.ara = false;
      cq.aba = null;
      br.aca();
      if (var1.size() != 0) {
         this.aba = var1;
         this.afa = 60;
         this.aga = 60;

         for(int var2 = 0; var2 < var1.size(); ++var2) {
            ca var3 = (ca)var1.elementAt(var2);
            if (fw.ala.aaa(var3.aaa) > this.afa - 8) {
               var3.aba = fw.ala.aba(var3.aaa, this.afa - 8);
            }
         }

         this.ada = (GameCanvas.aza - var1.size() * this.afa) / 2;
         if (this.ada <= 0) {
            this.ada = 1;
         }

         this.aea = GameCanvas.baa - this.aga - (fk.afa + 1);
         if (GameCanvas.afa) {
            this.aea -= 3;
         }

         this.aha = this.aea;
         this.aaa = true;
         this.aca = 0;
         if ((aka = this.aba.size() * this.afa - GameCanvas.aza) < 0) {
            aka = 0;
         }

         aia = 0;
         aja = 0;
         ala = 50;
         this.asa = var1.size() * this.afa - 1;
         if (this.asa > GameCanvas.aza - 2) {
            this.asa = GameCanvas.aza - 2;
         }

         if (GameCanvas.afa) {
            this.aca = -1;
         }
      }

   }

   private void aca() {
      if (this.aaa) {
         boolean var1 = false;
         if (!GameCanvas.aka[2] && !GameCanvas.aka[4]) {
            if (!GameCanvas.aka[8] && !GameCanvas.aka[6]) {
               if (GameCanvas.aka[5]) {
                  if (this.aoa != null) {
                     if (this.aoa.ada > 0) {
                        if (this.aoa.aca == GameScr.ava()) {
                           GameScr.ava().aba(this.aoa.ada, this.aoa.aja);
                        } else {
                           this.aaa(this.aoa.ada, this.aoa.aja);
                        }
                     }
                  } else {
                     this.aya = 2;
                  }
               } else if (GameCanvas.aka[12]) {
                  if (this.ama.ada > 0) {
                     this.aaa(this.ama.ada, this.ama.aja);
                  } else {
                     this.aya = 2;
                  }
               } else if (!this.ara && (GameCanvas.aka[13] || fb.aaa(this.ana))) {
                  this.aaa = false;
                  br.aca();
               }
            } else {
               var1 = true;
               ++this.aca;
               if (this.aca > this.aba.size() - 1) {
                  this.aca = 0;
               }
            }
         } else {
            var1 = true;
            --this.aca;
            if (this.aca < 0) {
               this.aca = this.aba.size() - 1;
            }
         }

         this.aoa = null;
         if (GameScr.dja && !GameCanvas.afa && this.aca != -1) {
            ca var2 = (ca)this.aba.elementAt(this.aca);
            fa var3;
            if ((var3 = dc.ada().aaa(var2.aaa)) != null && var3.aaa == 2) {
               this.aoa = new ca(er.bna, this, 1000, var3);
            }
         }

         if (var1) {
            if ((aia = this.aca * this.afa + this.afa - GameCanvas.aza / 2) > aka) {
               aia = aka;
            }

            if (aia < 0) {
               aia = 0;
            }

            if (this.aca == this.aba.size() - 1 || this.aca == 0) {
               aja = aia;
            }
         }

         if (!this.ara && GameCanvas.aoa && !GameCanvas.aca(this.ada, this.aea, this.asa, this.aga) && !this.awa) {
            this.ata = this.aua = 0;
            this.awa = false;
            this.aaa = false;
            GameCanvas.aoa = false;
            return;
         }

         int var4;
         int var6;
         if (GameCanvas.ama) {
            if (!this.awa && GameCanvas.aca(this.ada, this.aea, this.asa, this.aga)) {
               for(var4 = 0; var4 < this.ava.length; ++var4) {
                  this.ava[0] = GameCanvas.apa;
               }

               this.aua = GameCanvas.apa;
               this.awa = true;
               this.axa = this.aza != 0;
               this.aza = 0;
            } else if (this.awa) {
               ++this.ata;
               if (this.ata > 5 && this.aua == GameCanvas.apa && !this.axa) {
                  this.aua = -1000;
                  this.aca = (aia + GameCanvas.apa - this.ada) / this.afa;
               }

               if ((var4 = GameCanvas.apa - this.ava[0]) != 0 && this.aca != -1) {
                  this.aca = -1;
               }

               for(var6 = this.ava.length - 1; var6 > 0; --var6) {
                  int[] var10002 = this.ava;
                  var10002[var6] = var10002[var6 - 1];
               }

               this.ava[0] = GameCanvas.apa;
               if ((aia -= var4) < 0) {
                  aia = 0;
               }

               if (aia > aka) {
                  aia = aka;
               }

               if (aja < 0 || aja > aka) {
                  var4 /= 2;
               }

               aja -= var4;
            }
         }

         if (GameCanvas.aoa && this.awa) {
            var4 = GameCanvas.apa - this.ava[0];
            GameCanvas.aoa = false;
            if (ci.aea(var4) < 20 && ci.aea(GameCanvas.apa - this.aua) < 20 && !this.axa) {
               this.aza = 0;
               aia = aja;
               this.aua = -1000;
               this.aca = (aia + GameCanvas.apa - this.ada) / this.afa;
               this.ata = 0;
               this.aya = 10;
            } else if (this.aca != -1 && this.ata > 5) {
               this.ata = 0;
               this.aya = 1;
            } else if (this.aca == -1 && !this.axa) {
               if (aja < 0) {
                  aia = 0;
               } else if (aja > aka) {
                  aia = aka;
               } else {
                  byte var5;
                  if ((var6 = GameCanvas.apa - this.ava[0] + (this.ava[0] - this.ava[1]) + (this.ava[1] - this.ava[2])) > 10) {
                     var5 = 10;
                  } else if (var6 < -10) {
                     var5 = -10;
                  } else {
                     var5 = 0;
                  }

                  this.aza = -var5 * 100;
               }
            }

            this.awa = false;
            this.ata = 0;
            GameCanvas.aoa = false;
         }

         GameCanvas.aka();
         GameCanvas.ala();
      }

   }

   private void aaa(as var1) {
      try {
         var1.aaa(-var1.aba(), -var1.aca());
         var1.aaa(-aja, 0);
         int var2;
         String[] var3;
         int var4;
         int var5;
         if (GameCanvas.afa) {
            for(var2 = 0; var2 < this.aba.size(); ++var2) {
               if (var2 == this.aca) {
                  var1.aaa(aqa, this.ada + var2 * this.afa + 1, this.aha + 1, 0);
               } else {
                  var1.aaa(apa, this.ada + var2 * this.afa + 1, this.aha + 1, 0);
               }

               if ((var3 = ((ca)this.aba.elementAt(var2)).aba) == null) {
                  var3 = new String[]{((ca)this.aba.elementAt(var2)).aaa};
               }

               var4 = this.aha + (this.aga - var3.length * 14) / 2 + 1;

               for(var5 = 0; var5 < var3.length; ++var5) {
                  if (GameScr.dja) {
                     if (dc.ada().ada(var3[var5])) {
                        if (GameCanvas.aua % 10 > 5) {
                           fw.ana.aaa(var1, var3[var5], this.ada + var2 * this.afa + this.afa / 2 - 2, var4 + var5 * 14, 2);
                        } else {
                           fw.ala.aaa(var1, var3[var5], this.ada + var2 * this.afa + this.afa / 2 - 2, var4 + var5 * 14, 2);
                        }
                     } else {
                        fw.ala.aaa(var1, var3[var5], this.ada + var2 * this.afa + this.afa / 2 - 2, var4 + var5 * 14, 2);
                     }
                  } else {
                     fw.ala.aaa(var1, var3[var5], this.ada + var2 * this.afa + this.afa / 2 - 2, var4 + var5 * 14, 2);
                  }
               }
            }
         } else {
            for(var2 = 0; var2 < this.aba.size(); ++var2) {
               if (var2 == this.aca) {
                  var1.aaa(aqa, this.ada + var2 * this.afa + 1, this.aha + 1 - 23, 0);
               } else {
                  var1.aaa(apa, this.ada + var2 * this.afa + 1, this.aha + 1 - 23, 0);
               }

               if ((var3 = ((ca)this.aba.elementAt(var2)).aba) == null) {
                  var3 = new String[]{((ca)this.aba.elementAt(var2)).aaa};
               }

               var4 = this.aha + (this.aga - var3.length * 14) / 2 + 1 - 23;

               for(var5 = 0; var5 < var3.length; ++var5) {
                  if (GameScr.dja) {
                     if (dc.ada().ada(var3[var5])) {
                        if (GameCanvas.aua % 10 > 5) {
                           fw.ana.aaa(var1, var3[var5], this.ada + var2 * this.afa + this.afa / 2 - 2, var4 + var5 * 14, 2);
                        } else {
                           fw.ala.aaa(var1, var3[var5], this.ada + var2 * this.afa + this.afa / 2 - 2, var4 + var5 * 14, 2);
                        }
                     } else {
                        fw.ala.aaa(var1, var3[var5], this.ada + var2 * this.afa + this.afa / 2 - 2, var4 + var5 * 14, 2);
                     }
                  } else {
                     fw.ala.aaa(var1, var3[var5], this.ada + var2 * this.afa + this.afa / 2 - 2, var4 + var5 * 14, 2);
                  }
               }
            }
         }

         var1.aaa(-var1.aba(), -var1.aca());
      } catch (Exception var6) {
         var6.printStackTrace();
      }
   }

   private void ada() {
      if (this.aza != 0 && !this.awa) {
         if ((aia += this.aza / 100) < 0) {
            aia = 0;
         } else if (aia > aka) {
            aia = aka;
         } else {
            aja = aia;
         }

         this.aza = this.aza * 9 / 10;
         if (this.aza < 100 && this.aza > -100) {
            this.aza = 0;
         }
      }

      if (aja != aia && !this.awa) {
         this.baa = aia - aja << 2;
         this.bba += this.baa;
         aja += this.bba >> 4;
         this.bba &= 15;
      }

      if (this.aha > this.aea) {
         int var1;
         if ((var1 = this.aha - this.aea >> 1) <= 0) {
            var1 = 1;
         }

         this.aha -= var1;
      }

      if (ala != 0 && (ala >>= 1) < 0) {
         ala = 0;
      }

      if (this.aya > 0) {
         --this.aya;
         GameScr.dja = false;
         if (this.aya == 0) {
            this.aaa = false;
            ca var2;
            if (this.aca >= 0 && (var2 = (ca)this.aba.elementAt(this.aca)) != null) {
               var2.aaa();
            }
         }
      }

   }

   public final void aaa(int var1, Object var2) {
      if (var1 == 1000) {
         fa var3 = (fa)var2;
         this.aba.removeAllElements();
         dc.ada().aea(var3.aba);
         dc.ada().aaa.removeElement(var3);

         for(var1 = 0; var1 < dc.ada().aaa.size(); ++var1) {
            fa var4 = (fa)dc.ada().aaa.elementAt(var1);
            this.aba.addElement(new ca(var4.aba, (ag)null, 12001, var1));
         }

         this.aba.addElement(new ca(er.qta, (ag)null, 12006, (Object)null));
         this.aba.addElement(new ca(er.qua, (ag)null, 12008, (Object)null));

         for(var1 = 0; var1 < this.aba.size(); ++var1) {
            ca var5 = (ca)this.aba.elementAt(var1);
            if (fw.ala.aaa(var5.aaa) > this.afa - 8) {
               var5.aba = fw.ala.aba(var5.aaa, this.afa - 8);
            }
         }

         aka = this.aba.size() * this.afa - GameCanvas.aza;
         if ((aia = this.aca * this.afa + this.afa - GameCanvas.aza / 2) > aka) {
            aia = aka;
         }

         if (aia < 0) {
            aia = 0;
         }

         if (this.aca == this.aba.size() - 1 || this.aca == 0) {
            aja = aia;
         }
      }

   }

   public static void aba() {
      aia = 0;
      aja = 0;
      aka = 0;
      ala = 0;
      apa = null;
      aqa = null;
   }
}
