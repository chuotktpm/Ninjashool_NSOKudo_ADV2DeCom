import javax.microedition.lcdui.Canvas;
import javax.microedition.lcdui.Graphics;

public final class fg extends Canvas implements Runnable {
   public static fg aaa;
   public ee aba;
   private int ada = 1;
   public static boolean aca;

   public fg() {
      this.setFullScreenMode(true);
      as.aba = this.ada = 1;
   }

   public static fg aaa() {
      if (aaa == null) {
         aaa = new fg();
      }

      return aaa;
   }

   protected final void paint(Graphics var1) {
      this.aba.aaa(var1);
   }

   protected final void keyPressed(int var1) {
      this.aba.aba(var1);
   }

   protected final void keyReleased(int var1) {
      this.aba.aca(var1);
   }

   protected final void pointerDragged(int var1, int var2) {
      var1 /= this.ada;
      var2 /= this.ada;
      this.aba.aaa(var1, var2);
   }

   protected final void pointerPressed(int var1, int var2) {
      var1 /= this.ada;
      var2 /= this.ada;
      this.aba.aba(var1, var2);
   }

   protected final void pointerReleased(int var1, int var2) {
      var1 /= this.ada;
      var2 /= this.ada;
      this.aba.aca(var1, var2);
   }

   public final int aba() {
      return this.ada == 1 ? this.getHeight() : 0;
   }

   public final int aca() {
      return this.ada == 1 ? this.getWidth() : 0;
   }

   public final void run() {
      try {
         Thread.sleep(10L);
      } catch (InterruptedException var8) {
      }

      aca = true;

      while(aca) {
         try {
            long var1 = System.currentTimeMillis();
            this.aba.aea();
            long var3 = System.currentTimeMillis() - var1;

            try {
               Thread.sleep(var3 < (long)Code.aza ? (long)Code.aza - var3 : 1L);
            } catch (InterruptedException var6) {
            }
         } catch (Exception var7) {
            try {
               Thread.sleep(1000L);
            } catch (InterruptedException var5) {
               var5.printStackTrace();
            }

            var7.printStackTrace();
         }
      }

   }

   public static void ada() {
   }

   static {
      aa.aaa(53);
      ada();
   }

   public static void aea() {
      aaa = null;
      aca = false;
   }
}
