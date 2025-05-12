
// Source code is decompiled from a .class file using FernFlower decompiler.
import javax.microedition.lcdui.Image;

public final class Class_av extends Class_bc {
   private static Class_cd a;
   private static Class_cd b;
   private static Image g = GameCanvas.loadImage("/u/tuyet.png");
   private static Image h = GameCanvas.loadImage("/u/cobay.png");
   private byte i = 0;
   private int j = 0;
   private MyVector k = new MyVector();

   public Class_av(byte var1, int var2) {
      this.i = var1;
      this.j = var2;
      switch (var1) {
         case 1:
            var2 = 10;
            if (a == null) {
               a = new Class_cd(h, 16, 10);
            }
         case 2:
         default:
            break;
         case 3:
            if (b == null) {
               b = new Class_cd(g, 5, 5);
            }
      }

      for(int var3 = 0; var3 < var2; ++var3) {
         Class_df var4 = new Class_df((GameScr.i - 20 + Class_fa.d((GameCanvas.width + 40) / 5) * 5) * 10, (GameScr.j - 20 + Class_fa.d(GameCanvas.height / 5) * 5) * 10);
         if (var1 == 3) {
            var4.d = Class_fa.d(3);
         } else {
            var4.d = Class_fa.d(4);
         }

         var4.f = 16 + (Class_fa.d(3) << 2);
         var4.c = Class_fa.b(-1, 1);
         var4.e = Class_fa.d(var4.f);
         this.k.addElement(var4);
      }

   }

   public final void a(mGraphics var1) {
      var1.translateXY(-var1.getTranslateX(), -var1.getTranslateY());
      var1.setClip(0, -200, GameCanvas.width, 200 + GameCanvas.height);
      int var2;
      Class_df var3;
      switch (this.i) {
         case 1:
            for(var2 = 0; var2 < this.j; ++var2) {
               var3 = (Class_df)this.k.elementAt(var2);
               a.a(var3.e / (var3.f / 4), var3.a / 10 - GameScr.i, var3.b / 10 - GameScr.j, 0, 3, var1);
            }

            return;
         case 2:
         default:
            return;
         case 3:
            for(var2 = 0; var2 < this.j; ++var2) {
               if ((var3 = (Class_df)this.k.elementAt(var2)).d > 0) {
                  if (Scroll.g == null) {
                     Scroll.g = new Scroll();
                  }

                  int var4 = Scroll.g.a * (2 - var3.d) * 20 / 120 - GameScr.i;
                  b.a(var3.d, var4 + var3.a / 10, var3.b / 10 - GameScr.j, 2, 0, var1);
               }
            }

      }
   }

   public final void a() {
      Class_df var10000;
      Class_av var2;
      int var3;
      Class_df var4;
      switch (this.i) {
         case 1:
            var2 = this;
            var3 = 0;

            for(; var3 < var2.j; ++var3) {
               var10000 = var4 = (Class_df)var2.k.elementAt(var3);
               var10000.b += 10;
               var4.a += var4.c * 10;
               if (++var4.e >= var4.f) {
                  var4.e = 0;
               }

               if (var4.b / 10 > GameScr.j + GameCanvas.height - (3 - var4.d) * 40 || var4.a / 10 < GameScr.i - GameCanvas.ab || var4.a / 10 > GameScr.i + GameCanvas.width + GameCanvas.ab) {
                  var2.a(var4);
               }
            }

            return;
         case 2:
         default:
            return;
         case 3:
            var2 = this;

            for(var3 = 0; var3 < var2.j; ++var3) {
               var10000 = var4 = (Class_df)var2.k.elementAt(var3);
               var10000.b += (var4.d + 1) * 5;
               var4.a += var4.d + 1 << 1;
               if (var4.b / 10 > GameScr.j + GameCanvas.height - (3 - var4.d) * 30) {
                  var2.a(var4);
               }

               int var1 = GameScr.i * (2 - var4.d) * 20 / 120;
               if (var4.a / 10 + var1 < GameScr.i - 10) {
                  var4.a += (GameCanvas.width + 20) * 10;
               }

               if (var4.a / 10 + var1 > GameScr.i + GameCanvas.width + 10) {
                  var4.a -= (GameCanvas.width + 20) * 10;
               }
            }

      }
   }

   private void a(Class_df var1) {
      var1.a = (GameScr.i - 20 + Class_fa.d((GameCanvas.width + 40) / 5) * 5) * 10;
      var1.b = (GameScr.j - GameCanvas.ac + Class_fa.d(GameCanvas.height / 5) * 5) * 10;
      if (this.i == 3) {
         var1.d = Class_fa.d(3);
      } else {
         var1.d = Class_fa.d(4);
      }
   }
}
