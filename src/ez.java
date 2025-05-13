public final class ez extends fb implements ag {
   private int aea;
   private int afa;
   private int aga;
   private int aha;
   private int aia = -1;
   private static String[] aja;
   public static String aaa;
   public static String aba;
   public static String aca;
   public static String ada;
   private static ca aka;
   private static ca asa;
   private static ca ata;
   private static ca aua;
   private static ca[][] ava;

   public ez() {
      GameCanvas.bea.aca = Class_ab.ada[0];
      Class_ab.aga = Class_ab.aaa[0];

      for(int var1 = 0; var1 < Class_ab.ada.length; ++var1) {
         if (fd.ada("indServer") == Class_ab.ada[var1]) {
            GameCanvas.bea.aca = Class_ab.ada[var1];
            Class_ab.aga = Class_ab.aaa[var1];
            return;
         }
      }

   }

   public final void aaa() {
      GameScr.aca = GameCanvas.baa;
      if (GameCanvas.bqa == 2) {
         GameCanvas.aaa(0);
      } else {
         GameCanvas.aaa(TileMap.ama);
      }

      super.aaa();
      if (GameScr.aaa != null) {
         GameScr.aaa = null;
      }

      if ((TileMap.ama = (byte)((int)(System.currentTimeMillis() % 9L))) == 5 || TileMap.ama == 6) {
         TileMap.ama = 4;
      }

      GameScr.aaa(true);
      GameScr.aia = 100;
      this.aea = 170;
      this.afa = 175;
      if (GameCanvas.aza == 128 || GameCanvas.baa <= 208) {
         this.aea = 126;
         this.afa = 160;
      }

      this.aga = GameCanvas.aza / 2 - this.aea / 2;
      this.aha = GameCanvas.baa / 2 - this.afa / 2;
      if (GameCanvas.baa <= 250) {
         this.aha -= 10;
      }

      super.ana = new ca(er.daa, GameCanvas.aja, 8885, (Object)null);
      this.aia = -1;
      if (!GameCanvas.afa) {
         this.aia = 0;
      }

      if (GameCanvas.afa && GameCanvas.aza >= 320) {
         super.ana.afa = GameCanvas.aza / 2 + 88;
      }

      if (aka == null) {
         aka = new ca(GameCanvas.afa ? "" : er.dca, this, 1000, (Object)null);
         asa = new ca(GameCanvas.afa ? "" : er.dca, this, 1001, (Object)null);
         aua = new ca(GameCanvas.afa ? "" : er.dca, this, 1002, (Object)null);
         ata = new ca(GameCanvas.afa ? "" : er.dca, this, 1003, (Object)null);
         ava = new ca[][]{{aka, asa, aua}, {ata, aka, asa, aua}};
      }

      if ((aaa == null || aaa.equals("")) && aca.equals("")) {
         aja = new String[]{er.tga, er.tia, er.tja};
      } else {
         aja = new String[]{er.tha, er.tga, er.tia, er.tja};
      }

      GameCanvas.bea.aca = Class_ab.ada[0];
      Class_ab.aga = Class_ab.aaa[0];

      for(int var1 = 0; var1 < Class_ab.ada.length; ++var1) {
         if (fd.ada("indServer") == Class_ab.ada[var1]) {
            GameCanvas.bea.aca = Class_ab.ada[var1];
            Class_ab.aga = Class_ab.aaa[var1];
            break;
         }
      }

      if (fd.aca("random") == null) {
         fd.aaa("random", aea());
      }

   }

   public final void aaa(as var1) {
      var1.aaa(0);
      var1.aca(0, 0, GameCanvas.aza, GameCanvas.baa);
      GameCanvas.aaa(var1);
      var1.aaa(ed.aba, GameCanvas.bba - ed.aba.getWidth() / 2, this.aha + 10 - ed.aba.getHeight() / 2, 0);
      if (GameCanvas.bea.aca == -1) {
         GameCanvas.bea.aca = 0;
      }

      int var2 = this.aha + 50;

      for(int var3 = 0; var3 < aja.length; ++var3) {
         var1.aaa(fk.aca);
         var1.aca(this.aga + 10, var2 + var3 * 35, this.aea - 20, 28);
         fk.aba(this.aga + 10, var2 + var3 * 35, this.aea - 20, 28, var1);
         if (var3 == this.aia) {
            var1.aaa(fk.aba);
            var1.aca(this.aga + 10, var2 + var3 * 35, this.aea - 20, 28);
            fk.aba(this.aga + 10, var2 + var3 * 35, this.aea - 20, 28, var1);
         }

         if (var3 < aja.length) {
            if (aaa.equals("") && aca.equals("")) {
               if (var3 == 2) {
                  fw.aga.aaa(var1, aja[var3] + Class_ab.ala[GameCanvas.bea.aca], this.aga + this.aea / 2, var2 + var3 * 35 + 8, 2);
               } else {
                  fw.aga.aaa(var1, aja[var3], this.aga + this.aea / 2, var2 + var3 * 35 + 8, 2);
               }
            } else if (var3 == 0) {
               fw.aga.aaa(var1, aja[var3] + (!aca.equals("") ? ": " + aca : (aaa.startsWith("tmpusr") ? "" : ": " + aaa)), this.aga + this.aea / 2, var2 + var3 * 35 + 8, 2);
            } else if (var3 == 3) {
               fw.aga.aaa(var1, aja[var3] + Class_ab.ala[GameCanvas.bea.aca], this.aga + this.aea / 2, var2 + var3 * 35 + 8, 2);
            } else {
               fw.aga.aaa(var1, aja[var3], this.aga + this.aea / 2, var2 + var3 * 35 + 8, 2);
            }
         }
      }

      if (GameCanvas.bia == null) {
         fk.aaa(var1, super.ala, super.ama, super.ana);
      }

      super.aaa(var1);
   }

   public final void aba() {
      if (aaa.equals("") && aca.equals("")) {
         if (this.aia >= 0 && this.aia < ava[0].length) {
            super.ama = ava[0][this.aia];
         }
      } else if (this.aia >= 0 && this.aia < ava[1].length) {
         super.ama = ava[1][this.aia];
      }

      if (++GameScr.aia > GameCanvas.aza * 3 + 100) {
         GameScr.aia = 100;
      }

      super.aba();
   }

   public final void aca() {
      if (!GameCanvas.aka[2] && !GameCanvas.aka[4]) {
         if (GameCanvas.aka[8] || GameCanvas.aka[6]) {
            ++this.aia;
            if (this.aia > aja.length - 1) {
               this.aia = 0;
            }
         }
      } else {
         --this.aia;
         if (this.aia < 0) {
            this.aia = aja.length - 1;
         }
      }

      if (GameCanvas.aoa && GameCanvas.aba(this.aga + 10, this.aha + 45, this.aea - 10, 140)) {
         if (GameCanvas.ana) {
            this.aia = (GameCanvas.aqa - (this.aha + 45)) / 35;
         }

         if (aaa.equals("") && aca.equals("")) {
            if (this.aia >= 0 && this.aia < ava[0].length) {
               ava[0][this.aia].aaa();
            }
         } else if (this.aia >= 0 && this.aia < ava[1].length) {
            ava[1][this.aia].aaa();
         }
      }

      super.aca();
      GameCanvas.aka();
   }

   private static void ala() {
      if (!cs.aba().afa) {
         GameCanvas.aca();
      }

      GameCanvas.ana();
   }

   public static boolean ada() {
      return aaa != null && (aaa.startsWith("tmpusr") || aaa.equals(""));
   }

   public static String aea() {
      String var0 = "";

      for(int var1 = 0; var1 < 12; ++var1) {
         String var2 = Integer.toString(ci.aba(0, 9));
         var0 = var0 + var2;
      }

      return var0;
   }

   public final void aaa(int var1, Object var2) {
      switch(var1) {
      case 1000:
         if (ada() && !aaa.equals("")) {
            GameCanvas.aaa(er.tfa, new ca(er.tha, this, 10001, (Object)null), new ca(er.cza, GameCanvas.aja, 8882, (Object)null));
            return;
         }

         ala();
         Service.aaa().aaa("-1", "12345", "1.4.8");
         return;
      case 1001:
         if (ada() && !aaa.equals("") && aca.equals("")) {
            GameCanvas.aaa(er.tfa, new ca(er.tka, this, 10004, (Object)null), new ca(er.cza, GameCanvas.aja, 8882, (Object)null));
            return;
         }

         GameCanvas.bga.aaa();
         return;
      case 1002:
         ev var3 = new ev();
         if (ed.aaa == 1) {
            var3.addElement(new ca("LOCAL 44", this, 200041, (Object)null));
         } else if (ed.aaa == 2) {
            var3.addElement(new ca("LOCAL 46", this, 200042, (Object)null));
         }

         var3.addElement(new ca(Class_ab.ala[Class_ab.ada[0]], this, 20000, (Object)null));
         var3.addElement(new ca(Class_ab.ala[Class_ab.ada[1]], this, 20001, (Object)null));
         GameCanvas.bea.aaa(var3);
         if (fd.ada("indServer") != -1 && !GameCanvas.afa) {
            GameCanvas.bea.aca = fd.ada("indServer");
         }

         return;
      case 1003:
         ala();
         if (!aca.equals("")) {
            aaa = aca;
            aba = ada;
            aca = "";
            ada = "";
            fd.aaa("acc", aaa);
            fd.aaa("pass", aba);
         }

         Service.aaa().aaa(aaa, aba, "1.4.8");
         return;
      case 10001:
         ala();
         Service.aaa().aaa("-1", "12345", "1.4.8");
         if (!aca.equals("")) {
            aaa = aca;
            aba = ada;
            aca = "";
            ada = "";
            fd.aaa("acc", aaa);
            fd.aaa("pass", aba);
            return;
         }
      case 200042:
         GameCanvas.bea.aaa = false;
         Class_ab.aga = Class_ab.aaa[0];
         Class_ab.afa = 14446;
         Class_ab.aka = Class_ab.aca[0];
         fd.aaa("indServer", Class_ab.aca[0]);
      default:
         return;
      case 10004:
         GameCanvas.bia = null;
         GameCanvas.bga.aaa();
         return;
      case 20000:
         GameCanvas.bea.aaa = false;
         Class_ab.aga = Class_ab.aaa[0];
         Class_ab.afa = Class_ab.aba[0];
         Class_ab.aka = Class_ab.aca[0];
         fd.aaa("indServer", Class_ab.ada[0]);
         return;
      case 20001:
         GameCanvas.bea.aaa = false;
         Class_ab.aga = Class_ab.aaa[1];
         Class_ab.afa = Class_ab.aba[1];
         Class_ab.aka = Class_ab.aca[1];
         fd.aaa("indServer", Class_ab.ada[1]);
         return;
      case 200041:
         GameCanvas.bea.aaa = false;
         Class_ab.aga = Class_ab.aaa[0];
         Class_ab.afa = 14444;
         Class_ab.aka = Class_ab.aca[0];
         fd.aaa("indServer", Class_ab.aca[0]);
      }
   }

   public static void aga() {
      aca = "";
      ada = "";
      aka = null;
      asa = null;
      ata = null;
      aua = null;
      ava = null;
      aaa = fd.aca("acc");
      aba = fd.aca("pass");
      if (aaa == null) {
         aaa = "";
      }

      if (aba == null) {
         aba = "";
      }

   }

   static {
      aa.aaa(48);
      aga();
   }

   public static void aha() {
      aja = null;
      aaa = null;
      aba = null;
      aca = null;
      ada = null;
      aka = null;
      asa = null;
      ata = null;
      aua = null;
      ava = null;
   }
}
