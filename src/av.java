public final class av extends fz {
   public cm aaa;
   public static cm[] aba;

   public av(int var1, int var2, int var3, int var4) {
      super.ala = var2;
      super.ama = var3;
      super.aqa = var1;
      this.aaa = aba[var4];
   }

   public static void aaa() {
      for(int var0 = 0; var0 < gf.boa.size(); ++var0) {
         av var1;
         (var1 = (av)gf.boa.elementAt(var0)).gza = null;
         var1.gya = -1;
      }

   }

   public final void aba() {
      if (super.gza == null) {
         label45: {
            label51: {
               byte[] var1 = new byte[]{-1, 9, 9, 10, 10, 11, 11};
               if (fz.ala().aua >= 9 && fz.ala().aua <= 10 && fz.ala().cua.aaa > 0 && var1[fz.ala().cua.aaa] == this.aaa.aaa) {
                  if (fz.ala().cza != null) {
                     if (fz.ala().cza == null || fz.ala().cza.aaa + 1 != fz.ala().cza.aea.length) {
                        break label45;
                     }

                     super.gza = gf.bca[62];
                     break label51;
                  }
               } else {
                  gf.ava();
                  byte var2 = gf.bna();
                  if (fz.ala().cza != null || var2 != this.aaa.aaa) {
                     if (fz.ala().cza == null || var2 != this.aaa.aaa) {
                        break label45;
                     }

                     if (fz.ala().cza.aaa + 1 == fz.ala().cza.aea.length) {
                        super.gza = gf.bca[62];
                        break label51;
                     }
                  }
               }

               super.gza = gf.bca[57];
            }

            super.gya = 0;
         }
      }

      super.aba();
   }

   public final void aaa(as var1) {
      if (this.axa() && super.aqa != 15) {
         if (super.dla != 0) {
            super.aaa(var1);
            return;
         }

         if (this.aaa != null) {
            if (this.aaa.aaa == 13) {
               if (fz.ala().dra != null && fz.ala().dra.equals(this)) {
                  fo.aaa(var1, 988, super.ala, super.ama - super.cja - 1, 0, 33);
               }

               fo.aaa(var1, 1060, super.ala, super.ama, 0, 33);
               fw.aka.aaa(var1, String.valueOf(gn.ala), super.ala, super.ama - 10 - 2 - fw.aia.aaa, 2);
               return;
            }

            if (this.aaa.aaa == 31) {
               if (fz.ala().dra != null && fz.ala().dra.equals(this)) {
                  fo.aaa(var1, 988, super.ala, super.ama - super.cja - 1, 0, 33);
               }

               fo.aaa(var1, 1291, super.ala, super.ama, 0, 33);
               return;
            }

            if (this.aaa.aaa == 27) {
               if (fz.ala().dra != null && fz.ala().dra.equals(this)) {
                  fo.aaa(var1, 988, super.ala, super.ama - super.cja - 1, 0, 33);
               }

               fo.aaa(var1, 1224, super.ala, super.ama, 0, 33);
               return;
            }

            fj var2 = gf.bba[this.aaa.aca];
            fj var3 = gf.bba[this.aaa.aea];
            fj var4 = gf.bba[this.aaa.ada];
            if (super.ara == 1) {
               fo.aaa(var1, var2.aaa[fz.gda[super.cma][0][0]].aaa, super.ala + fz.gda[super.cma][0][1] + var2.aaa[fz.gda[super.cma][0][0]].aba, super.ama - fz.gda[super.cma][0][2] + var2.aaa[fz.gda[super.cma][0][0]].aca, 0, 0);
               fo.aaa(var1, var3.aaa[fz.gda[super.cma][1][0]].aaa, super.ala + fz.gda[super.cma][1][1] + var3.aaa[fz.gda[super.cma][1][0]].aba, super.ama - fz.gda[super.cma][1][2] + var3.aaa[fz.gda[super.cma][1][0]].aca, 0, 0);
               fo.aaa(var1, var4.aaa[fz.gda[super.cma][2][0]].aaa, super.ala + fz.gda[super.cma][2][1] + var4.aaa[fz.gda[super.cma][2][0]].aba, super.ama - fz.gda[super.cma][2][2] + var4.aaa[fz.gda[super.cma][2][0]].aca, 0, 0);
            } else {
               fo.aaa(var1, var2.aaa[fz.gda[super.cma][0][0]].aaa, super.ala - fz.gda[super.cma][0][1] - var2.aaa[fz.gda[super.cma][0][0]].aba, super.ama - fz.gda[super.cma][0][2] + var2.aaa[fz.gda[super.cma][0][0]].aca, 2, 24);
               fo.aaa(var1, var3.aaa[fz.gda[super.cma][1][0]].aaa, super.ala - fz.gda[super.cma][1][1] - var3.aaa[fz.gda[super.cma][1][0]].aba, super.ama - fz.gda[super.cma][1][2] + var3.aaa[fz.gda[super.cma][1][0]].aca, 2, 24);
               fo.aaa(var1, var4.aaa[fz.gda[super.cma][2][0]].aaa, super.ala - fz.gda[super.cma][2][1] - var4.aaa[fz.gda[super.cma][2][0]].aba, super.ama - fz.gda[super.cma][2][2] + var4.aaa[fz.gda[super.cma][2][0]].aca, 2, 24);
            }

            if (super.gya >= 0 && super.gza != null && super.dla == 0) {
               fo.aaa(var1, super.gza.aba[super.gya].aca, super.ala + super.gza.aba[super.gya].aaa, super.ama + super.gza.aba[super.gya].aba, 0, 3);
               if (ab.aua % 2 == 0) {
                  ++super.gya;
                  if (super.gya >= super.gza.aba.length) {
                     super.gya = 0;
                  }
               }
            }

            if (fz.ala().dra != null && fz.ala().dra.equals(this)) {
               fw.ala.aaa(var1, this.aaa.aba, super.ala, super.ama - super.cja - fw.aia.aaa - 7, 2, fw.ama);
               fo.aaa(var1, 988, super.ala, super.ama - super.cja - 2, 0, 33);
               return;
            }

            fw.ala.aaa(var1, this.aaa.aba, super.ala, super.ama - super.cja - 3 - fw.aia.aaa, 2, fw.ama);
         }
      }

   }

   public static void aca() {
   }

   static {
      aa.aaa(6);
      aca();
   }

   public static void ada() {
      aba = null;
   }
}
