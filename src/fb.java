public class fb {
   public ca ala;
   public ca ama;
   public ca ana;
   public static final int aoa;
   public static int apa;
   public static int aqa;
   public static int ara;

   private static void ada() {
      aoa = fw.aqa.aaa + 8;
      apa = 70 * as.aba;
      aqa = 22;
      ara = -1;
   }

   public static void aia() {
      ada();
   }

   static {
      aa.aaa(49);
      aia();
   }

   public void aaa() {
      GameCanvas.aka();
      GameCanvas.ala();
      if (GameCanvas.bda != null) {
         GameCanvas.bda.d_();
      }

      GameCanvas.bda = this;
      fg.aaa.setFullScreenMode(true);
   }

   public void d_() {
   }

   public static void aja() {
      if (GameCanvas.afa) {
         aqa = 26;
      } else {
         aqa = 24;
      }
   }

   public void aaa(int var1) {
   }

   public void aba() {
   }

   public void aca() {
      if (GameCanvas.aka[5] || aaa(GameCanvas.bda.ama)) {
         GameCanvas.aka[5] = false;
         ara = -1;
         GameCanvas.aoa = false;
         if (this.ama != null) {
            this.ama.aaa();
         }
      }

      if (GameCanvas.aka[12] || aaa(GameCanvas.bda.ala)) {
         GameCanvas.aka[12] = false;
         ara = -1;
         GameCanvas.aoa = false;
         if (bp.aaa().aba) {
            if (bp.aaa().ada != null) {
               bp.aaa().ada.aaa();
            }
         } else if (this.ala != null) {
            this.ala.aaa();
         }
      }

      if (GameCanvas.aka[13] || aaa(GameCanvas.bda.ana)) {
         GameCanvas.aka[13] = false;
         ara = -1;
         GameCanvas.aoa = false;
         if (bp.aaa().aba) {
            if (bp.aaa().aea != null) {
               bp.aaa().aea.aaa();
               return;
            }
         } else if (this.ana != null) {
            this.ana.aaa();
         }
      }

   }

   public static boolean aaa(ca var0) {
      if (var0 == null) {
         return false;
      } else if (var0.afa != 0 && var0.aga != 0) {
         return var0.aba();
      } else {
         if (GameCanvas.bia != null) {
            if (GameCanvas.bia.ada != null && GameCanvas.aba(GameCanvas.aza - apa >> 1, GameCanvas.baa - aqa - 5, apa, aqa + 10)) {
               ara = 1;
               if (var0 == GameCanvas.bia.ada && GameCanvas.ana && GameCanvas.aoa) {
                  return true;
               }
            }

            if (GameCanvas.bia.aca != null && GameCanvas.aba(0, GameCanvas.baa - aqa - 5, apa, aqa + 10)) {
               ara = 0;
               if (var0 == GameCanvas.bia.aca && GameCanvas.ana && GameCanvas.aoa) {
                  return true;
               }
            }

            if (GameCanvas.bia.aea != null && GameCanvas.aba(GameCanvas.aza - apa, GameCanvas.baa - aqa - 5, apa, aqa + 10)) {
               ara = 2;
               if ((var0 == GameCanvas.bia.aea || var0 == bp.aaa().aea) && GameCanvas.ana && GameCanvas.aoa) {
                  return true;
               }
            }
         } else {
            if (var0 == GameCanvas.bda.ala && GameCanvas.aba(0, GameCanvas.baa - aqa - 5, apa, aqa + 10)) {
               ara = 0;
               if (GameCanvas.ana && GameCanvas.aoa) {
                  return true;
               }
            }

            if (var0 == GameCanvas.bda.ana && GameCanvas.aba(GameCanvas.aza - apa, GameCanvas.baa - aqa - 5, apa, aqa + 10)) {
               ara = 2;
               if (GameCanvas.ana && GameCanvas.aoa) {
                  return true;
               }
            }

            if ((var0 == GameCanvas.bda.ama || cq.aba != null) && GameCanvas.aba(GameCanvas.aza - apa >> 1, GameCanvas.baa - aqa - 5, apa, aqa + 10)) {
               ara = 1;
               if (GameCanvas.ana && GameCanvas.aoa) {
                  return true;
               }
            }
         }

         return false;
      }
   }

   public void aaa(as var1) {
      var1.aaa(-var1.aba(), -var1.aca());
      var1.ada(0, 0, GameCanvas.aza, GameCanvas.baa + 1);
      fk.aaa(var1);
      if (cq.aba != null) {
         fk.aaa(var1, (ca)null, cq.aba.aaa, (ca)null);
      } else if (bp.aaa().aba) {
         fk.aaa(var1, bp.aaa().ada, bp.aaa().afa, bp.aaa().aea);
      } else {
         if (GameCanvas.bia == null && !GameCanvas.bea.aaa) {
            fk.aaa(var1, this.ala, this.ama, this.ana);
         }

      }
   }

   public static void aka() {
      aoa = 0;
      apa = 0;
      aqa = 0;
      ara = 0;
   }
}
