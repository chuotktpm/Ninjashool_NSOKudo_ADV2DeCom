public final class fc extends fb implements ag {
   private static fc aaa;
   private static eq aba;
   private static int aca;
   private static int ada;
   private static int aea;
   private static int[][] afa;
   private static int[] aga;
   private static int[] aha;
   private ca aia;
   private ca aja;
   private int aka = 0;

   public static void ada() {
      afa = new int[][]{{11, 26, 27, 28}, {2, 23, 24, 25}};
      aga = new int[]{9, 0};
      aha = new int[]{10, 1};
   }

   static {
      aa.aaa(50);
      ada();
   }

   public static fc aea() {
      if (aaa == null) {
         aaa = new fc();
      }

      return aaa;
   }

   public fc() {
      if (GameCanvas.aza == 128) {
         GameScr.aba(128, 120);
         GameScr.gia = (GameCanvas.aza - 128) / 2;
         GameScr.gha = 0;
      } else {
         GameScr.aba(170, 190);
         GameScr.gia = (GameCanvas.aza - 170) / 2;
         GameScr.gha = (GameCanvas.baa - 220) / 2;
      }

      aca = 1;
      (aba = new eq()).aua = er.ffa;
      aba.aca = 100;
      aba.aaa = GameScr.gia + 45;
      aba.aaa = GameScr.gia + GameScr.gja / 2 - aba.aca / 2;
      aba.aba = GameScr.gha + 62;
      if (GameCanvas.aza == 128) {
         aba.aca = 60;
      }

      aba.ada = 26;
      aba.aea = true;
      aba.ara = 0;
      aca = 1;
      ada = 0;
      super.ama = new ca(er.fea, this, 8000, (Object)null);
      super.ala = new ca(er.fja, this, 8001, (Object)null);
      this.aia = new ca("", this, 8002, GameScr.gia + GameScr.gja / 2 - fb.apa / 2, GameScr.gha + 70 + 30);
      this.aja = new ca("", this, 8003, GameScr.gia + GameScr.gja / 2 - fb.apa / 2, GameScr.gha + 70 + 70);
      super.ana = aba.ava;
   }

   public final void aaa() {
      aca = GameCanvas.aua % 2;
      ada = GameCanvas.aua % 4;
      super.aaa();
   }

   public final void aaa(int var1) {
      aba.aaa(var1);
   }

   public final void aba() {
      if (++GameScr.aia > GameCanvas.aza * 3 + 100) {
         GameScr.aia = 100;
      }

      if (GameCanvas.afa && GameCanvas.aza >= 320) {
         if (super.ala != null) {
            super.ala.afa = GameCanvas.aza / 2 - 160;
            super.ala.aga = GameCanvas.baa - 26;
         }

         if (super.ama != null) {
            super.ama.afa = GameCanvas.aza / 2 - 35;
            super.ama.aga = GameCanvas.baa - 26;
         }

         if (super.ana != null) {
            super.ana.afa = GameCanvas.aza / 2 + 88;
            super.ana.aga = GameCanvas.baa - 26;
         }
      }

      if (this.aja != null) {
         this.aja.aca();
      }

      if (this.aia != null) {
         this.aia.aca();
      }

   }

   public final void aca() {
      if (GameCanvas.aka[2] && --aea < 0) {
         aea = er.jva.length - 1;
      }

      if (GameCanvas.aka[8] && ++aea >= er.jva.length) {
         aea = 0;
      }

      if (aea == 0) {
         super.ana = aba.ava;
         aba.ada();
      }

      if (aea == 1) {
         if (GameCanvas.aka[4] && --aca < 0) {
            aca = er.jwa.length - 1;
         }

         if (GameCanvas.aka[6] && ++aca > er.jwa.length - 1) {
            aca = 0;
         }

         super.ana = null;
      }

      if (aea == 2) {
         if (GameCanvas.aka[4] && --ada < 0) {
            ada = er.gka[0].length - 1;
         }

         if (GameCanvas.aka[6] && ++ada > er.gka[0].length - 1) {
            ada = 0;
         }
      }

      if (GameCanvas.aoa && GameCanvas.aba(GameScr.gia + 5, GameScr.gha + 65, GameScr.gja - 5, fb.aoa)) {
         aea = 0;
      }

      super.aca();
      GameCanvas.ala();
      GameCanvas.aka();
   }

   public final void aaa(as var1) {
      try {
         GameCanvas.aaa(var1);
         fk.aaa(GameScr.gia, GameScr.gha, GameScr.gja, GameScr.gka, var1);
         byte var2 = 40;
         if (GameCanvas.aza == 128) {
            var2 = 20;
         }

         int var3 = afa[aca][ada];
         int var4 = aga[aca];
         int var5 = aha[aca];
         fj var9 = GameScr.bba[var3];
         fj var10 = GameScr.bba[var4];
         fj var11 = GameScr.bba[var5];
         int var6 = GameCanvas.aza / 2;
         int var7 = GameScr.gha + 50;
         fo.aaa(var1, var9.aaa[Char.gda[0][0][0]].aaa, var6 + Char.gda[0][0][1] + var9.aaa[Char.gda[0][0][0]].aba, var7 - Char.gda[0][0][2] + var9.aaa[Char.gda[0][0][0]].aca, 0, 0);
         fo.aaa(var1, var10.aaa[Char.gda[0][1][0]].aaa, var6 + Char.gda[0][1][1] + var10.aaa[Char.gda[0][1][0]].aba, var7 - Char.gda[0][1][2] + var10.aaa[Char.gda[0][1][0]].aca, 0, 0);
         fo.aaa(var1, var11.aaa[Char.gda[0][2][0]].aaa, var6 + Char.gda[0][2][1] + var11.aaa[Char.gda[0][2][0]].aba, var7 - Char.gda[0][2][2] + var11.aaa[Char.gda[0][2][0]].aca, 0, 0);
         if (!GameCanvas.afa) {
            for(var3 = 0; var3 < er.jva.length; ++var3) {
               if (aea == var3) {
                  var4 = var3 > 0 ? -5 : 0;
                  fo.aaa(var1, 989, GameScr.gia + 10 + (GameCanvas.aua % 7 > 3 ? 1 : 0), GameScr.gha + 76 + var3 * var2 + var4, 2, af.aga);
                  fo.aaa(var1, 989, GameScr.gia + GameScr.gja - 15 - (GameCanvas.aua % 7 > 3 ? 1 : 0), GameScr.gha + 76 + var3 * var2 + var4, 0, af.aga);
               }
            }
         }

         if (GameCanvas.afa) {
            this.aia.aaa = er.jwa[aca];
            this.aia.aaa(var1);
            this.aja.aaa = er.gka[aca][ada];
            this.aja.aaa(var1);
         } else {
            fk.aba(this.aia.afa, this.aia.aga, this.aia.aha, this.aia.aia, var1);
            if (aea == 1) {
               var1.aaa(fk.aba);
               var1.aca(this.aia.afa, this.aia.aga, this.aia.aha, this.aia.aia);
               fk.aba(this.aia.afa, this.aia.aga, this.aia.aha, this.aia.aia, var1);
            }

            fk.aba(this.aja.afa, this.aja.aga, this.aja.aha, this.aja.aia, var1);
            if (aea == 2) {
               var1.aaa(fk.aba);
               var1.aca(this.aja.afa, this.aja.aga, this.aja.aha, this.aja.aia);
               fk.aba(this.aja.afa, this.aja.aga, this.aja.aha, this.aja.aia, var1);
            }

            fw.aga.aaa(var1, er.jwa[aca], GameScr.gia + 85, GameScr.gha + 66 + var2, 2);
            fw.aga.aaa(var1, er.gka[aca][ada], GameScr.gia + 85, GameScr.gha + 66 + (var2 << 1), 2);
         }

         aba.aaa = GameScr.gia + GameScr.gja / 2 - aba.aca / 2;
         aba.aba = GameScr.gha + 62;
         aba.aha = er.ffa;
         aba.aaa(var1);
         super.aaa(var1);
         var1.aaa(0);
      } catch (Exception var8) {
         System.out.println("CreateCharScr.paint(): 0");
         var8.printStackTrace();
      }
   }

   public final void aaa(int var1, Object var2) {
      switch(var1) {
      case 8000:
         Service var10000 = Service.aaa();
         int var4 = afa[aca][ada];
         int var3 = aca;
         String var8 = aba.aia;
         Service var7 = var10000;
         fe var5 = new fe((byte)-28);

         try {
            var5.aca.writeByte(-125);
            var5.aca.writeUTF(var8);
            var5.aca.writeByte(var3);
            var5.aca.writeByte(var4);
         } catch (Exception var6) {
            var6.printStackTrace();
         }

         var7.aaa.aaa(var5);
         return;
      case 8001:
         if (cl.aea().aja) {
            GameCanvas.bfa.aaa();
            return;
         }

         cl.aea().aaa();
         return;
      case 8002:
         this.aka = 1;
         aea = 1;
         if (this.aka == aea && --aca < 0) {
            aca = er.jwa.length - 1;
            return;
         }
         break;
      case 8003:
         this.aka = 2;
         aea = 2;
         if (this.aka == aea && ++ada > er.gka[0].length - 1) {
            ada = 0;
         }
      }

   }

   public static void aga() {
      aaa = null;
      aba = null;
      aca = 0;
      ada = 0;
      aea = 0;
      afa = null;
      aga = null;
      aha = null;
   }
}
