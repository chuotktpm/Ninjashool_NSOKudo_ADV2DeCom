public final class cj extends Auto {
   private static long aba;
   private long aca = 0L;
   private boolean ada = false;
   public static Auto aaa;

   public final void aba() {
      super.a_();
      if (Code.bwa == -1 || Code.bxa == -1 || Code.bya == -1) {
         Code.bwa = 70;
         Code.bxa = 1500;
         Code.bya = 528;
      }

      this.aga = Code.bwa;
      this.aha = Code.bva;
      this.aia = gn.aga(Code.bwa);
   }

   protected final void aaa() {
      long var1 = (fz.ala().aka > 0L ? fz.ala().aka : fz.ala().bha) * 100L / GameScr.dta[fz.ala().aya];
      if ((fz.ala().aka <= 0L || Math.abs(var1) > 15L) && (fz.ala().aka > 0L || Math.abs(var1) < 0L)) {
         Service.aaa().awa(0);
         GameScr.chatPopup("Đã pk xong!!");
         if (aaa != null) {
            LockGame.bla();
            Code.aba = aaa;
            aaa = null;
         } else {
            Code.aca();
         }
      } else if (fz.ala().dka <= 10 && !this.ada) {
         if (aka()) {
            aaa(true);

            try {
               Thread.sleep(1500L);
            } catch (InterruptedException var4) {
            }
         } else if (gn.aoa == Code.bwa && gn.ala == Code.bua) {
            if (fz.ala().ala == Code.bxa && fz.ala().ama == Code.bya) {
               if (System.currentTimeMillis() - aba >= 300L) {
                  ev var8 = new ev();

                  for(int var2 = 0; var2 < GameScr.bla.size(); ++var2) {
                     fz var3;
                     if ((var3 = (fz)GameScr.bla.elementAt(var2)).bba > 0 && Math.abs(fz.ala().ala - var3.ala) <= 50 && Math.abs(fz.ala().ama - var3.ama) <= 50 && var8.size() <= aqa.aia) {
                        var8.addElement(var3);
                        if (var3.bba > 0 && Math.abs(fz.ala().ala - var3.ala) <= 50 && Math.abs(fz.ala().ama - var3.ama) <= 50) {
                           Service.aaa().aaa((ev)(new ev()), (ev)var8, (int)2);
                           aba = System.currentTimeMillis();
                        }
                     }
                  }
               }

               try {
                  Thread.sleep(100L);
               } catch (InterruptedException var5) {
               }
            } else {
               Service.aaa().awa(3);
               if (Code.bxa != -1 && Code.bya != -1) {
                  fz.aca(Code.bxa, Code.bya);
               } else {
                  Code.bxa = fz.ala().ala;
                  Code.bya = fz.ala().ama;
               }

               try {
                  Thread.sleep(500L);
               } catch (InterruptedException var6) {
               }
            }
         } else {
            this.aaa(Code.bwa, Code.bua, -1, -1);
         }
      } else {
         this.ada = fz.ala().dka > 6;
         if (aka()) {
            aaa(true);
         } else if (gn.aoa == Code.bwa && gn.ala == Code.bva) {
            if (fz.ala().ala == Code.bxa && fz.ala().ama == Code.bya) {
               Code.apa();
               if (System.currentTimeMillis() - this.aca >= 30000L) {
                  Code var10000 = Code.aaa;
                  Code.aha("buon nhu cho can");
                  this.aca = System.currentTimeMillis();
               }
            } else {
               Service.aaa().awa(3);
               if (Code.bxa != -1 && Code.bya != -1) {
                  fz.aca(Code.bxa, Code.bya);
               } else {
                  Code.bxa = fz.ala().ala;
                  Code.bya = fz.ala().ama;
               }

               try {
                  Thread.sleep(500L);
               } catch (InterruptedException var7) {
               }
            }
         } else {
            this.aaa(Code.bwa, Code.bva, -1, -1);
         }
      }
   }

   public final String toString() {
      return "Auto pk âm";
   }

   public static void aca() {
      aba = 0L;
   }

   static {
      aa.aaa(19);
      aca();
   }

   public static void ada() {
      aba = 0L;
      aaa = null;
   }
}
