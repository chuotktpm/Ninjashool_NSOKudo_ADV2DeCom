import javax.microedition.lcdui.Image;

public final class bm extends cu {
   private static ae aaa;
   private static ae aba;
   private static Image aga;
   private static Image aha;
   private byte aia = 0;
   private int aja = 0;
   private ev aka = new ev();

   public static void aaa() {
      aga = GameCanvas.aca("/u/tuyet.png");
      aha = GameCanvas.aca("/u/cobay.png");
   }

   static {
      aa.aaa(11);
      aaa();
   }

   public bm(byte var1, int var2) {
      this.aia = var1;
      this.aja = var2;
      switch(var1) {
      case 1:
         var2 = 10;
         if (aaa == null) {
            aaa = new ae(aha, 16, 10);
         }
      case 2:
      default:
         break;
      case 3:
         if (aba == null) {
            aba = new ae(aga, 5, 5);
         }
      }

      for(int var3 = 0; var3 < var2; ++var3) {
         cf var4 = new cf((GameScr.aia - 20 + ci.ada((GameCanvas.aza + 40) / 5) * 5) * 10, (GameScr.aja - 20 + ci.ada(GameCanvas.baa / 5) * 5) * 10);
         if (var1 == 3) {
            var4.ada = ci.ada(3);
         } else {
            var4.ada = ci.ada(4);
         }

         var4.afa = 16 + (ci.ada(3) << 2);
         var4.aca = ci.aba(-1, 1);
         var4.aea = ci.ada(var4.afa);
         this.aka.addElement(var4);
      }

   }

   public final void aaa(as var1) {
      var1.aaa(-var1.aba(), -var1.aca());
      var1.ada(0, -200, GameCanvas.aza, 200 + GameCanvas.baa);
      int var2;
      cf var3;
      switch(this.aia) {
      case 1:
         for(var2 = 0; var2 < this.aja; ++var2) {
            var3 = (cf)this.aka.elementAt(var2);
            aaa.aaa(var3.aea / (var3.afa / 4), var3.aaa / 10 - GameScr.aia, var3.aba / 10 - GameScr.aja, 0, 3, var1);
         }

         return;
      case 2:
      default:
         return;
      case 3:
         for(var2 = 0; var2 < this.aja; ++var2) {
            if ((var3 = (cf)this.aka.elementAt(var2)).ada > 0) {
               if (cw.aga == null) {
                  cw.aga = new cw();
               }

               int var4 = cw.aga.aaa * (2 - var3.ada) * 20 / 120 - GameScr.aia;
               aba.aaa(var3.ada, var4 + var3.aaa / 10, var3.aba / 10 - GameScr.aja, 2, 0, var1);
            }
         }

      }
   }

   public final void aba() {
      cf var10000;
      bm var1;
      int var2;
      cf var3;
      switch(this.aia) {
      case 1:
         var1 = this;
         var2 = 0;

         for(; var2 < var1.aja; ++var2) {
            var10000 = var3 = (cf)var1.aka.elementAt(var2);
            var10000.aba += 10;
            var3.aaa += var3.aca * 10;
            if (++var3.aea >= var3.afa) {
               var3.aea = 0;
            }

            if (var3.aba / 10 > GameScr.aja + GameCanvas.baa - (3 - var3.ada) * 40 || var3.aaa / 10 < GameScr.aia - GameCanvas.bba || var3.aaa / 10 > GameScr.aia + GameCanvas.aza + GameCanvas.bba) {
               var1.aaa(var3);
            }
         }

         return;
      case 2:
      default:
         return;
      case 3:
         var1 = this;

         for(var2 = 0; var2 < var1.aja; ++var2) {
            var10000 = var3 = (cf)var1.aka.elementAt(var2);
            var10000.aba += (var3.ada + 1) * 5;
            var3.aaa += var3.ada + 1 << 1;
            if (var3.aba / 10 > GameScr.aja + GameCanvas.baa - (3 - var3.ada) * 30) {
               var1.aaa(var3);
            }

            int var4 = GameScr.aia * (2 - var3.ada) * 20 / 120;
            if (var3.aaa / 10 + var4 < GameScr.aia - 10) {
               var3.aaa += (GameCanvas.aza + 20) * 10;
            }

            if (var3.aaa / 10 + var4 > GameScr.aia + GameCanvas.aza + 10) {
               var3.aaa -= (GameCanvas.aza + 20) * 10;
            }
         }

      }
   }

   private void aaa(cf var1) {
      var1.aaa = (GameScr.aia - 20 + ci.ada((GameCanvas.aza + 40) / 5) * 5) * 10;
      var1.aba = (GameScr.aja - GameCanvas.bca + ci.ada(GameCanvas.baa / 5) * 5) * 10;
      if (this.aia == 3) {
         var1.ada = ci.ada(3);
      } else {
         var1.ada = ci.ada(4);
      }
   }

   public static void aca() {
      aaa = null;
      aba = null;
      aga = null;
      aha = null;
   }
}
