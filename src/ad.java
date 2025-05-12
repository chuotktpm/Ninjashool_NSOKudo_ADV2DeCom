public final class ad implements Runnable {
   private final int aaa;

   ad(int var1) {
      this.aaa = var1;
   }

   public final void run() {
      av var1 = gf.aia(13);
      int var2 = -1;
      if (var1 != null && var1.aqa != 15) {
         if (Math.abs(var1.ala - fz.ala().ala) > 22 || Math.abs(var1.ama - fz.ala().ama) > 22) {
            fz.aca(var1.ala, var1.ama);
         }
      } else {
         if (gn.aoa != 99 && gn.aoa != 103 && gn.aoa != 134 && gn.aoa != 135 && gn.aoa != 136 && gn.aoa != 137) {
            return;
         }

         if ((var2 = fz.aia(37)) < 0 && (var2 = fz.aia(35)) < 0) {
            return;
         }
      }

      gm.aaa().aaa(this.aaa, var2);
      gn.aga();

      try {
         Thread.sleep(100L);
      } catch (InterruptedException var3) {
         var3.printStackTrace();
      }
   }
}
