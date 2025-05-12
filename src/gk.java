public final class gk extends Auto {
   private static boolean aaa;
   private static boolean aba;
   private long aca = 0L;
   private long ada;

   public final void aea() {
      super.a_();
      aaa = false;
      aba = false;
      this.ada = System.currentTimeMillis();
   }

   public final void aaa() {
      if (aka()) {
         if (gn.aoa == 160) {
            try {
               Thread.sleep(500L);
            } catch (InterruptedException var3) {
            }
         } else {
            Auto.aaa(true);
         }
      } else {
         if (System.currentTimeMillis() - this.ada >= 30000L) {
            Code var1 = Code.aaa;
            Code.aha("chao e. a dung day tu chieu");
            this.ada = System.currentTimeMillis();
         }

         Code.apa();
         if (!aaa && !aba) {
            if (gn.aoa == 110) {
               aaa = true;
               aba = false;
               return;
            }

            if (gn.aoa != Code.bqa) {
               if (gn.aoa != 160 && gn.aoa != 129 && gn.aoa != 149) {
                  this.aaa(Code.bqa, Code.bra, -1, -1);
                  return;
               }

               try {
                  Thread.sleep(1000L);
               } catch (InterruptedException var4) {
               }

               Auto.ala();
               return;
            }

            if (gn.ala != Code.bra) {
               Auto.aba(Code.bra);
            }
         } else if (aaa && !aba) {
            if (gn.aoa == 160) {
               aaa = true;
               aba = true;
               cs.aaa.ada();
               Controller.aea().aba();
               return;
            }

            if (gn.aoa == 110) {
               av var7 = gf.aia(0);
               if (fz.ala().ala != var7.ala || fz.ala().ama != var7.ama) {
                  fz.aca(var7.ala, var7.ama);

                  try {
                     Thread.sleep(1000L);
                  } catch (InterruptedException var5) {
                  }

                  this.aca = System.currentTimeMillis();
                  return;
               }

               if (System.currentTimeMillis() - this.aca >= 2000L) {
                  gf.aba(0, 1, 0);
                  gm.aaa().aaa((short)11212, (String)String.valueOf(dm.aaa));
                  ab.ama();

                  try {
                     Thread.sleep(3000L);
                  } catch (InterruptedException var6) {
                  }

                  this.aca = System.currentTimeMillis();
               }
            }
         } else if (aaa && aba && gn.aoa != 160) {
            aaa = false;
            aba = false;
         }

      }
   }

   public final String toString() {
      return "Lôi lose";
   }

   public static void afa() {
      aaa = false;
      aba = false;
   }

   static {
      aa.aaa(70);
      afa();
   }

   public static void aga() {
      aaa = false;
      aba = false;
   }
}
