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
      ab.aka();
      ab.ala();
      if (ab.bda != null) {
         ab.bda.d_();
      }

      ab.bda = this;
      fg.aaa.setFullScreenMode(true);
   }

   public void d_() {
   }

   public static void aja() {
      if (ab.afa) {
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
      if (ab.aka[5] || aaa(ab.bda.ama)) {
         ab.aka[5] = false;
         ara = -1;
         ab.aoa = false;
         if (this.ama != null) {
            this.ama.aaa();
         }
      }

      if (ab.aka[12] || aaa(ab.bda.ala)) {
         ab.aka[12] = false;
         ara = -1;
         ab.aoa = false;
         if (bp.aaa().aba) {
            if (bp.aaa().ada != null) {
               bp.aaa().ada.aaa();
            }
         } else if (this.ala != null) {
            this.ala.aaa();
         }
      }

      if (ab.aka[13] || aaa(ab.bda.ana)) {
         ab.aka[13] = false;
         ara = -1;
         ab.aoa = false;
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
         if (ab.bia != null) {
            if (ab.bia.ada != null && ab.aba(ab.aza - apa >> 1, ab.baa - aqa - 5, apa, aqa + 10)) {
               ara = 1;
               if (var0 == ab.bia.ada && ab.ana && ab.aoa) {
                  return true;
               }
            }

            if (ab.bia.aca != null && ab.aba(0, ab.baa - aqa - 5, apa, aqa + 10)) {
               ara = 0;
               if (var0 == ab.bia.aca && ab.ana && ab.aoa) {
                  return true;
               }
            }

            if (ab.bia.aea != null && ab.aba(ab.aza - apa, ab.baa - aqa - 5, apa, aqa + 10)) {
               ara = 2;
               if ((var0 == ab.bia.aea || var0 == bp.aaa().aea) && ab.ana && ab.aoa) {
                  return true;
               }
            }
         } else {
            if (var0 == ab.bda.ala && ab.aba(0, ab.baa - aqa - 5, apa, aqa + 10)) {
               ara = 0;
               if (ab.ana && ab.aoa) {
                  return true;
               }
            }

            if (var0 == ab.bda.ana && ab.aba(ab.aza - apa, ab.baa - aqa - 5, apa, aqa + 10)) {
               ara = 2;
               if (ab.ana && ab.aoa) {
                  return true;
               }
            }

            if ((var0 == ab.bda.ama || cq.aba != null) && ab.aba(ab.aza - apa >> 1, ab.baa - aqa - 5, apa, aqa + 10)) {
               ara = 1;
               if (ab.ana && ab.aoa) {
                  return true;
               }
            }
         }

         return false;
      }
   }

   public void aaa(as var1) {
      var1.aaa(-var1.aba(), -var1.aca());
      var1.ada(0, 0, ab.aza, ab.baa + 1);
      fk.aaa(var1);
      if (cq.aba != null) {
         fk.aaa(var1, (ca)null, cq.aba.aaa, (ca)null);
      } else if (bp.aaa().aba) {
         fk.aaa(var1, bp.aaa().ada, bp.aaa().afa, bp.aaa().aea);
      } else {
         if (ab.bia == null && !ab.bea.aaa) {
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
