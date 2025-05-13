public final class al implements Runnable {
   private GameScr aaa;

   al(GameScr var1) {
      this.aaa = var1;
   }

   public final void run() {
      cq.aaa("Diệt ma", fz.ala());

      for(int var1 = 0; var1 < 6; ++var1) {
         try {
            Thread.sleep(1000L);
         } catch (InterruptedException var5) {
            var5.printStackTrace();
         }

         byte var2;
         if (this.aaa.gua[var1 * 10 + 120] >>> 24 != 0) {
            var2 = 2;
         } else {
            int var6 = 0;
            int var3 = 0;

            int var4;
            for(var4 = 0; var4 < 10; ++var4) {
               if (this.aaa.gua[var1 * 10 + var4] >>> 24 != 0) {
                  ++var3;
               }
            }

            for(var4 = 0; var4 < 10; ++var4) {
               if (this.aaa.gua[var1 * 10 + var4 * 60] >>> 24 != 0) {
                  ++var6;
               }
            }

            if (var3 < var6) {
               var2 = 1;
            } else {
               var2 = 0;
            }
         }

         cq.aaa("Diệt ma: " + this.aaa.gta[var2], fz.ala());
         GameScr.aaa(this.aaa, var2);
      }

   }
}
