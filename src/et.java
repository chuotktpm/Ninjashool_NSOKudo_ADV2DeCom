import javax.microedition.lcdui.Image;

public final class et extends fb implements ag {
   private static et aaa;
   private boolean aba;
   private static Image aca;
   private static Image ada;
   private static Image aea;
   private static int afa;
   private static int aga;
   private static int aha;
   private static int aia;
   private static int aja;
   private static int aka;
   private static int asa;
   private static int ata;
   private static int aua;
   private static int ava;
   private static int awa;
   private static int axa;
   private static int aya;
   private static int aza;
   private static int baa;
   private static int bba;
   private static int bca;
   private static int bda;
   private static int bea;
   private static int[] bfa;
   private static int[] bga;
   private int bha;
   private int bia;
   private int bja;
   private int bka;
   private boolean bla = false;
   private int bma;
   private int bna;

   public et() {
      super.ana = new ca(er.bma, this, 1000, (Object)null);
      super.ama = new ca(er.gfa, this, 1001, (Object)null);
      super.ala = new ca("Chuyển đến", this, 14004, (Object)null);
   }

   private void aha() {
      if (this.aba) {
         super.ala = null;
      } else {
         super.ala = new ca("Chuyển đến", this, 14004, (Object)null);
      }

      int var1 = as.aaa(gn.aha);
      this.bja = (ab.aza - var1) / 2;
      this.bka = (ab.baa - 20 - as.aba(gn.aha)) / 2;
      if (this.bja < 0) {
         this.bja = 0;
      }

      if (this.bka < 0) {
         this.bka = 0;
      }

      if (this.aba) {
         baa = var1 + 20 - ab.aza;
         bba = as.aba(gn.aha) + 40 - ab.baa;
         this.bha = var1 + 20;
         this.bia = var1 + 40;
         if (this.bia < ab.baa - 26) {
            this.bia = ab.baa - 26;
         }

         if (this.bha < ab.aza) {
            this.bha = ab.aza;
         }

         aha = this.bja + fz.ala().ala / 12;
         aia = this.bka + fz.ala().ama / 12;
      } else {
         baa = 340 - ab.aza;
         bba = 340 - ab.baa;
         aha = bfa[gn.aoa] + bda;
         aia = bga[gn.aoa] + bea;
         this.bha = 330 + bda;
         this.bia = 310 + bea;
      }

      this.bha -= 10;
      this.bia -= 10;
      if (baa < 0) {
         baa = 0;
      }

      if (bba < 0) {
         bba = 0;
      }

      aza = 0;
      aya = 0;
      ata = 0;
      asa = 0;
      asa = aha - ab.bba;
      ata = aia - ab.bca;
   }

   public static et ada() {
      if (aaa == null) {
         aaa = new et();
      }

      return aaa;
   }

   public final void aaa() {
      super.aaa();
      fo.aca();
      gn.ada();
      super.ana = new ca(er.bma, this, 1000, (Object)null);
      super.ama = new ca(er.gfa, this, 1001, (Object)null);
      super.ala = new ca("Chuyển đến", this, 14004, (Object)null);
      if (aca == null) {
         aca = ab.aca("/wm.png");
         ada = ab.aca("/u/x.png");
         aea = ab.aca("/u/wpt1.png");
         afa = as.aba(aca);
         aga = as.aba(aca);
      }

      if (ab.aza > afa) {
         bda = ab.bba - afa / 2 - 12;
      }

      if (ab.baa > aga) {
         bea = ab.bca - aga / 2;
      }

      this.aha();
      ala();
      fw.ata.aba = null;
      fw.ava.aba = null;
      fw.asa.aba = null;
      fw.aua.aba = null;
      fw.aua.aba = null;
      fw.ara.aba = null;
      fw.aia.aba = null;
      fw.aoa.aba = null;
      fw.aja.aba = null;
      fw.apa.aba = null;
      fw.ana.aba = null;
      fw.ada.aba = null;
      fw.aea.aba = null;
      fw.aca.aba = null;
      fw.aga.aba = null;
      System.gc();
      gn.apa = gn.aoa;
   }

   public final void d_() {
      super.d_();
      aca = null;
      ada = null;
      System.gc();
      gn.aka();
      fo.ada();
      fw.ata.aba();
      fw.ava.aba();
      fw.asa.aba();
      fw.aua.aba();
      fw.aua.aba();
      fw.ara.aba();
      fw.aia.aba();
      fw.aoa.aba();
      fw.aja.aba();
      fw.apa.aba();
      fw.ana.aba();
      fw.ada.aba();
      fw.aea.aba();
      fw.aca.aba();
      fw.aga.aba();
   }

   public final void aaa(as var1) {
      boolean var2 = false;
      var1.aaa(0);
      var1.aca(0, 0, ab.aza, ab.baa);
      var1.aaa(10, 10);
      var1.aaa(-aya, -aza);
      int var3;
      int var4;
      int var5;
      int var6;
      if (this.aba) {
         var1.aaa(gn.aha, this.bja, this.bka, 0);

         for(var3 = 0; var3 < GameScr.bna.size(); ++var3) {
            ac var7;
            var4 = (var7 = (ac)GameScr.bna.elementAt(var3)).ada / 12;
            var5 = var7.aea / 12;
            if (var7.awa < fz.ala().aya - 2) {
               var1.aaa(11184810);
            } else if (var7.awa > fz.ala().aya + 2) {
               var1.aaa(16711680);
            } else {
               var1.aaa(16776960);
            }

            var1.aca(this.bja + var4 - 1, this.bka + var5 - 1, 3, 3);
         }

         for(var3 = 0; var3 < GameScr.bfa.size(); ++var3) {
            ep var9;
            if ((var9 = (ep)GameScr.bfa.elementAt(var3)).afa != null && var9.afa != fz.ala()) {
               var4 = var9.afa.ala / 12;
               var5 = var9.afa.ama / 12;
               if (ab.aua % 10 < 8) {
                  var1.aaa(16777215);
                  var1.aca(this.bja + var4 - 2, this.bka + var5 - 2, 5, 5);
                  var1.aaa(65280);
                  var1.aca(this.bja + var4 - 1, this.bka + var5 - 1, 3, 3);
               }
            }
         }

         GameScr.ava();
         GameScr.bna();

         for(var6 = 0; var6 < GameScr.boa.size(); ++var6) {
            av var10;
            var4 = (var10 = (av)GameScr.boa.elementAt(var6)).ala / 12;
            var5 = var10.ama / 12;
            var1.aaa(16777215);
            var1.aca(this.bja + var4 - 2, this.bka + var5 - 2, 5, 5);
            var1.aaa(65280);
            var1.aca(this.bja + var4 - 1, this.bka + var5 - 1, 3, 3);
            var1.aaa(ada, this.bja + var4, this.bka + var5, 3);
            var2 = true;
         }

         for(byte var11 = 0; var11 < gn.aua.size(); ++var11) {
            dn var8;
            var4 = ((var8 = (dn)gn.aua.elementAt(var11)).aaa + var8.aca) / 2 / 12;
            var5 = (var8.aba + var8.ada) / 2 / 12;
            if (ab.aua % 10 < 8) {
               var1.aaa(0);
               var1.aca(this.bja + var4 - 2, this.bka + var5 - 2, 5, 5);
               var1.aaa(16777215);
               var1.aca(this.bja + var4 - 1, this.bka + var5 - 1, 3, 3);
            }
         }

         var4 = fz.ala().ala / 12;
         var5 = fz.ala().ama / 12;
         var1.aaa(16777215);
         var1.aca(this.bja + var4 - 2, this.bka + var5 - 2, 5, 5);
         if (ab.aua % 10 > 5) {
            var1.aaa(255);
            var1.aca(this.bja + var4 - 1, this.bka + var5 - 1, 3, 3);
         }

         var1.aaa(aea, aha - 2, aia, 0);
         super.aaa(var1);
         if (!var2) {
            fw.aka.aaa(var1, gn.aka, 10, ab.baa - 17, 0);
         }
      } else {
         if (ab.aza > afa && ab.baa > aga) {
            var1.aaa(aca, ab.bba, ab.bca, af.aga);
         } else if (ab.aza > afa) {
            var1.aaa(aca, ab.bba, 0, af.aaa);
         } else if (ab.baa > aga) {
            var1.aaa(aca, 0, ab.bca, af.aha);
         } else {
            var1.aaa(aca, 0, 0, 0);
         }

         if (gn.aoa < gn.ava.length && gn.aoa >= 0) {
            var4 = 0;
            if (bfa[gn.aoa] != 1 || bga[gn.aoa] != 1) {
               var4 = bfa[gn.aoa] < 100 ? 0 : (bfa[gn.aoa] > 200 ? 1 : 2);
               ab.aaa(bfa[gn.aoa] + bda, bga[gn.aoa] + bea, var1);
            }

            var3 = 0;
            if (bca >= 0) {
               var4 = bfa[bca] < 100 ? 0 : (bfa[bca] > 200 ? 1 : 2);
               fw.aka.aaa(var1, gn.ava[bca], bfa[bca] + bda, bga[bca] + bea - 20, var4, fw.ama);
               var1.aaa(ada, bfa[bca] + bda, bga[bca] + bea, 3);
               var2 = true;
               var3 = bga[bca] - 20;
            } else if (bfa[gn.aoa] != 1 || bga[gn.aoa] != 1) {
               var3 = bga[gn.aoa] - 20;
               fw.ala.aaa(var1, gn.ava[gn.aoa], bfa[gn.aoa] + bda, bga[gn.aoa] + bea - 20, var4, fw.ama);
            }

            for(var6 = 0; var6 < fz.ala().fza.size(); ++var6) {
               aj var12;
               if ((var12 = (aj)fz.ala().fza.elementAt(var6)).aga >= 0 && var12.aga < bfa.length) {
                  var1.aaa(ada, bfa[var12.aga] + bda, bga[var12.aga] + bea, 3);
               }
            }

            if (aja >= 0 && (bca < 0 && gn.aoa != aja || bca >= 0 && aja != bca)) {
               var4 = bfa[aja] < 100 ? 0 : (bfa[aja] > 200 ? 1 : 2);
               var6 = bfa[aja];
               if ((var5 = bga[aja] - 20) > var3 && var5 - var3 < 30) {
                  var5 += 40;
               }

               if (var5 < var3 && var3 - var5 < 20) {
                  var5 -= 5;
               }

               fw.ala.aaa(var1, gn.ava[aja], var6 + bda, var5 + bea, var4, fw.ama);
            }
         }

         var1.aaa(aea, aha - 2, aia, 0);
         var1.aaa(-var1.aba(), -var1.aca());
         super.aaa(var1);
      }

      if (aja > 0) {
         int var13 = var2 ? 18 : 5;
         fw.ala.aaa(var1, "Map ID: " + aja, 5, var13, 0, fw.ama);
      }

      if (var2) {
         var1.aaa(ada, 10, 10, 3);
         fw.aka.aaa(var1, er.jaa, 20, 5, 0);
      }

   }

   public final void aca() {
      super.aca();
      if (++aka > 10000) {
         aka = 0;
      }

      if (aya != asa || aza != ata) {
         aua = asa - aya << 1;
         ava = ata - aza << 1;
         awa += aua;
         aya += awa >> 4;
         awa &= 15;
         axa += ava;
         aza += axa >> 4;
         axa &= 15;
         if (aya < 0) {
            aya = 0;
         }

         if (aya > baa) {
            aya = baa;
         }

         if (aza < 0) {
            aza = 0;
         }

         if (aza > bba) {
            aza = bba;
         }
      }

      boolean var1 = false;
      if (ab.ala[2]) {
         if ((aia -= 4) < bea - 10) {
            aia = bea - 10;
         }

         var1 = true;
      }

      if (ab.ala[8]) {
         if ((aia += 4) > this.bia) {
            aia = this.bia;
         }

         var1 = true;
      }

      if (ab.ala[4]) {
         if ((aha -= 4) < bda - 10) {
            aha = bda - 10;
         }

         var1 = true;
      }

      if (ab.ala[6]) {
         if ((aha += 4) > this.bha) {
            aha = this.bha;
         }

         var1 = true;
      }

      if (var1) {
         asa = aha - ab.bba;
         ata = aia - ab.bca;
         ala();
      }

      GameScr.ava();
      bca = GameScr.bma();
      if (ab.ana && ab.aqa < ab.baa - fb.aqa) {
         ab.ana = false;
         this.bla = true;
         this.bma = ab.apa;
         this.bna = ab.aqa;
      } else if (ab.ama && this.bla) {
         asa -= ab.apa - this.bma;
         ata -= ab.aqa - this.bna;
         if (asa < 0) {
            asa = 0;
         }

         if (ata < 0) {
            ata = 0;
         }

         if (asa > baa) {
            asa = baa;
         }

         if (ata > bba) {
            ata = bba;
         }

         aya = asa;
         aza = ata;
         this.bma = ab.apa;
         this.bna = ab.aqa;
      }

      if (ab.aoa) {
         int var3 = ab.ara - ab.apa;
         int var2 = ab.asa - ab.aqa;
         if (var3 < 10 && var2 < 10) {
            aha = aya + ab.ara - 8;
            aia = aza + ab.asa - 8;
            ala();
         }

         this.bla = false;
         ab.aoa = false;
      }

      if (ab.afa && ab.aza >= 320) {
         super.ala.afa = ab.aza / 2 - 160;
         super.ama.afa = ab.aza / 2 - 35;
         super.ana.afa = ab.aza / 2 + 88;
         super.ala.aga = super.ama.aga = super.ana.aga = ab.baa - 26;
      }

   }

   private static void ala() {
      aja = -1;

      for(int var0 = 0; var0 < bfa.length; ++var0) {
         if (ci.aea(aha - (bfa[var0] + bda)) < 10 && ci.aea(aia - (bga[var0] + bea)) < 10) {
            aja = var0;
            return;
         }
      }

   }

   public final void aaa(int var1, Object var2) {
      switch(var1) {
      case 1000:
         if (fz.ala().bba <= 0 || fz.ala().aqa == 14) {
            super.ama = GameScr.ava().gna;
            fz.ala().bba = 0;
         }

         GameScr.ava().aaa();
         return;
      case 1001:
         this.aba = !this.aba;
         this.aha();
         return;
      case 14004:
         gn.ala(aja);
      default:
      }
   }

   public static void aea() {
      aca = null;
      bda = 0;
      bea = 0;
      bfa = new int[]{1, 156, 140, 174, 196, 195, 125, 148, 156, 173, 199, 203, 222, 264, 283, 277, 298, 307, 311, 315, 116, 90, 59, 31, 252, 55, 81, 111, 148, 187, 219, 253, 278, 304, 311, 310, 284, 309, 294, 62, 92, 117, 99, 134, 154, 175, 34, 52, 40, 78, 59, 82, 114, 179, 158, 142, 1, 215, 291, 242, 147, 301, 71, 23, 116, 126, 305, 286, 264, 20, 46, 70, 78, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
      bga = new int[]{1, 68, 75, 88, 80, 107, 87, 114, 136, 160, 168, 196, 216, 219, 248, 265, 276, 260, 232, 204, 111, 82, 79, 59, 168, 33, 28, 34, 45, 20, 54, 44, 19, 40, 60, 100, 175, 165, 134, 181, 199, 208, 221, 220, 219, 221, 195, 217, 246, 244, 250, 263, 262, 241, 252, 244, 2, 240, 197, 139, 16, 18, 208, 223, 239, 186, 120, 119, 135, 107, 125, 126, 148, 3, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
   }

   static {
      aa.aaa(44);
      aea();
   }

   public static void aga() {
      aaa = null;
      aca = null;
      ada = null;
      aea = null;
      afa = 0;
      aga = 0;
      aha = 0;
      aia = 0;
      aja = 0;
      aka = 0;
      asa = 0;
      ata = 0;
      aua = 0;
      ava = 0;
      awa = 0;
      axa = 0;
      aya = 0;
      aza = 0;
      baa = 0;
      bba = 0;
      bca = 0;
      bda = 0;
      bea = 0;
      bfa = null;
      bga = null;
   }
}
