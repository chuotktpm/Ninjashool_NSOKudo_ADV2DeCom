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

      int var1 = as.aaa(TileMap.aha);
      this.bja = (GameCanvas.aza - var1) / 2;
      this.bka = (GameCanvas.baa - 20 - as.aba(TileMap.aha)) / 2;
      if (this.bja < 0) {
         this.bja = 0;
      }

      if (this.bka < 0) {
         this.bka = 0;
      }

      if (this.aba) {
         baa = var1 + 20 - GameCanvas.aza;
         bba = as.aba(TileMap.aha) + 40 - GameCanvas.baa;
         this.bha = var1 + 20;
         this.bia = var1 + 40;
         if (this.bia < GameCanvas.baa - 26) {
            this.bia = GameCanvas.baa - 26;
         }

         if (this.bha < GameCanvas.aza) {
            this.bha = GameCanvas.aza;
         }

         aha = this.bja + Char.getMyChar().cx / 12;
         aia = this.bka + Char.getMyChar().cy / 12;
      } else {
         baa = 340 - GameCanvas.aza;
         bba = 340 - GameCanvas.baa;
         aha = bfa[TileMap.mapID] + bda;
         aia = bga[TileMap.mapID] + bea;
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
      asa = aha - GameCanvas.bba;
      ata = aia - GameCanvas.bca;
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
      TileMap.ada();
      super.ana = new ca(er.bma, this, 1000, (Object)null);
      super.ama = new ca(er.gfa, this, 1001, (Object)null);
      super.ala = new ca("Chuyển đến", this, 14004, (Object)null);
      if (aca == null) {
         aca = GameCanvas.aca("/wm.png");
         ada = GameCanvas.aca("/u/x.png");
         aea = GameCanvas.aca("/u/wpt1.png");
         afa = as.aba(aca);
         aga = as.aba(aca);
      }

      if (GameCanvas.aza > afa) {
         bda = GameCanvas.bba - afa / 2 - 12;
      }

      if (GameCanvas.baa > aga) {
         bea = GameCanvas.bca - aga / 2;
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
      TileMap.apa = TileMap.mapID;
   }

   public final void d_() {
      super.d_();
      aca = null;
      ada = null;
      System.gc();
      TileMap.aka();
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
      var1.aca(0, 0, GameCanvas.aza, GameCanvas.baa);
      var1.aaa(10, 10);
      var1.aaa(-aya, -aza);
      int var3;
      int var4;
      int var5;
      int var6;
      if (this.aba) {
         var1.aaa(TileMap.aha, this.bja, this.bka, 0);

         for(var3 = 0; var3 < GameScr.bna.size(); ++var3) {
            ac var7;
            var4 = (var7 = (ac)GameScr.bna.elementAt(var3)).ada / 12;
            var5 = var7.aea / 12;
            if (var7.awa < Char.getMyChar().aya - 2) {
               var1.aaa(11184810);
            } else if (var7.awa > Char.getMyChar().aya + 2) {
               var1.aaa(16711680);
            } else {
               var1.aaa(16776960);
            }

            var1.aca(this.bja + var4 - 1, this.bka + var5 - 1, 3, 3);
         }

         for(var3 = 0; var3 < GameScr.bfa.size(); ++var3) {
            ep var9;
            if ((var9 = (ep)GameScr.bfa.elementAt(var3)).afa != null && var9.afa != Char.getMyChar()) {
               var4 = var9.afa.cx / 12;
               var5 = var9.afa.cy / 12;
               if (GameCanvas.aua % 10 < 8) {
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
            Npc var10;
            var4 = (var10 = (Npc)GameScr.boa.elementAt(var6)).cx / 12;
            var5 = var10.cy / 12;
            var1.aaa(16777215);
            var1.aca(this.bja + var4 - 2, this.bka + var5 - 2, 5, 5);
            var1.aaa(65280);
            var1.aca(this.bja + var4 - 1, this.bka + var5 - 1, 3, 3);
            var1.aaa(ada, this.bja + var4, this.bka + var5, 3);
            var2 = true;
         }

         for(byte var11 = 0; var11 < TileMap.aua.size(); ++var11) {
            dn var8;
            var4 = ((var8 = (dn)TileMap.aua.elementAt(var11)).aaa + var8.aca) / 2 / 12;
            var5 = (var8.aba + var8.ada) / 2 / 12;
            if (GameCanvas.aua % 10 < 8) {
               var1.aaa(0);
               var1.aca(this.bja + var4 - 2, this.bka + var5 - 2, 5, 5);
               var1.aaa(16777215);
               var1.aca(this.bja + var4 - 1, this.bka + var5 - 1, 3, 3);
            }
         }

         var4 = Char.getMyChar().cx / 12;
         var5 = Char.getMyChar().cy / 12;
         var1.aaa(16777215);
         var1.aca(this.bja + var4 - 2, this.bka + var5 - 2, 5, 5);
         if (GameCanvas.aua % 10 > 5) {
            var1.aaa(255);
            var1.aca(this.bja + var4 - 1, this.bka + var5 - 1, 3, 3);
         }

         var1.aaa(aea, aha - 2, aia, 0);
         super.aaa(var1);
         if (!var2) {
            fw.aka.aaa(var1, TileMap.aka, 10, GameCanvas.baa - 17, 0);
         }
      } else {
         if (GameCanvas.aza > afa && GameCanvas.baa > aga) {
            var1.aaa(aca, GameCanvas.bba, GameCanvas.bca, af.aga);
         } else if (GameCanvas.aza > afa) {
            var1.aaa(aca, GameCanvas.bba, 0, af.aaa);
         } else if (GameCanvas.baa > aga) {
            var1.aaa(aca, 0, GameCanvas.bca, af.aha);
         } else {
            var1.aaa(aca, 0, 0, 0);
         }

         if (TileMap.mapID < TileMap.ava.length && TileMap.mapID >= 0) {
            var4 = 0;
            if (bfa[TileMap.mapID] != 1 || bga[TileMap.mapID] != 1) {
               var4 = bfa[TileMap.mapID] < 100 ? 0 : (bfa[TileMap.mapID] > 200 ? 1 : 2);
               GameCanvas.aaa(bfa[TileMap.mapID] + bda, bga[TileMap.mapID] + bea, var1);
            }

            var3 = 0;
            if (bca >= 0) {
               var4 = bfa[bca] < 100 ? 0 : (bfa[bca] > 200 ? 1 : 2);
               fw.aka.aaa(var1, TileMap.ava[bca], bfa[bca] + bda, bga[bca] + bea - 20, var4, fw.ama);
               var1.aaa(ada, bfa[bca] + bda, bga[bca] + bea, 3);
               var2 = true;
               var3 = bga[bca] - 20;
            } else if (bfa[TileMap.mapID] != 1 || bga[TileMap.mapID] != 1) {
               var3 = bga[TileMap.mapID] - 20;
               fw.ala.aaa(var1, TileMap.ava[TileMap.mapID], bfa[TileMap.mapID] + bda, bga[TileMap.mapID] + bea - 20, var4, fw.ama);
            }

            for(var6 = 0; var6 < Char.getMyChar().fza.size(); ++var6) {
               aj var12;
               if ((var12 = (aj)Char.getMyChar().fza.elementAt(var6)).aga >= 0 && var12.aga < bfa.length) {
                  var1.aaa(ada, bfa[var12.aga] + bda, bga[var12.aga] + bea, 3);
               }
            }

            if (aja >= 0 && (bca < 0 && TileMap.mapID != aja || bca >= 0 && aja != bca)) {
               var4 = bfa[aja] < 100 ? 0 : (bfa[aja] > 200 ? 1 : 2);
               var6 = bfa[aja];
               if ((var5 = bga[aja] - 20) > var3 && var5 - var3 < 30) {
                  var5 += 40;
               }

               if (var5 < var3 && var3 - var5 < 20) {
                  var5 -= 5;
               }

               fw.ala.aaa(var1, TileMap.ava[aja], var6 + bda, var5 + bea, var4, fw.ama);
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
      if (GameCanvas.ala[2]) {
         if ((aia -= 4) < bea - 10) {
            aia = bea - 10;
         }

         var1 = true;
      }

      if (GameCanvas.ala[8]) {
         if ((aia += 4) > this.bia) {
            aia = this.bia;
         }

         var1 = true;
      }

      if (GameCanvas.ala[4]) {
         if ((aha -= 4) < bda - 10) {
            aha = bda - 10;
         }

         var1 = true;
      }

      if (GameCanvas.ala[6]) {
         if ((aha += 4) > this.bha) {
            aha = this.bha;
         }

         var1 = true;
      }

      if (var1) {
         asa = aha - GameCanvas.bba;
         ata = aia - GameCanvas.bca;
         ala();
      }

      GameScr.ava();
      bca = GameScr.bma();
      if (GameCanvas.ana && GameCanvas.aqa < GameCanvas.baa - fb.aqa) {
         GameCanvas.ana = false;
         this.bla = true;
         this.bma = GameCanvas.apa;
         this.bna = GameCanvas.aqa;
      } else if (GameCanvas.ama && this.bla) {
         asa -= GameCanvas.apa - this.bma;
         ata -= GameCanvas.aqa - this.bna;
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
         this.bma = GameCanvas.apa;
         this.bna = GameCanvas.aqa;
      }

      if (GameCanvas.aoa) {
         int var3 = GameCanvas.ara - GameCanvas.apa;
         int var2 = GameCanvas.asa - GameCanvas.aqa;
         if (var3 < 10 && var2 < 10) {
            aha = aya + GameCanvas.ara - 8;
            aia = aza + GameCanvas.asa - 8;
            ala();
         }

         this.bla = false;
         GameCanvas.aoa = false;
      }

      if (GameCanvas.afa && GameCanvas.aza >= 320) {
         super.ala.afa = GameCanvas.aza / 2 - 160;
         super.ama.afa = GameCanvas.aza / 2 - 35;
         super.ana.afa = GameCanvas.aza / 2 + 88;
         super.ala.aga = super.ama.aga = super.ana.aga = GameCanvas.baa - 26;
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
         if (Char.getMyChar().bba <= 0 || Char.getMyChar().aqa == 14) {
            super.ama = GameScr.ava().gna;
            Char.getMyChar().bba = 0;
         }

         GameScr.ava().aaa();
         return;
      case 1001:
         this.aba = !this.aba;
         this.aha();
         return;
      case 14004:
         TileMap.ala(aja);
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
