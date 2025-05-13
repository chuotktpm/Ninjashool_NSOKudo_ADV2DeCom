public final class cl extends fb implements ag {
   private static cl asa;
   private int ata = 48;
   private int aua = 85;
   private int ava;
   private int awa;
   private int axa;
   public int aaa;
   public int[] aba;
   public int[] aca;
   public int[] ada;
   public int[] aea;
   public int[] afa;
   public String[] aga;
   public String[] aha;
   public byte[] aia;
   private ca aya;
   private int aza;
   public boolean aja = true;
   public static String aka;

   public static void ada() {
      aka = "";
   }

   static {
      aa.aaa(21);
      ada();
   }

   public static cl aea() {
      if (asa == null) {
         asa = new cl();
      }

      return asa;
   }

   public cl() {
      if (GameCanvas.aza < 160) {
         this.ata = 32;
      }

      this.ava = 7;
      this.awa = (GameCanvas.aza - 3 * this.ata >> 1) - 5;
      this.axa = GameCanvas.bca - (this.aua >> 1) + 10;
      if (GameCanvas.afa && GameCanvas.aza > 200) {
         this.ata = 74;
         this.ava = 25;
         this.aua = 110;
         this.awa = (GameCanvas.aza - 3 * this.ata >> 1) - 20;
         this.axa = GameCanvas.bca - (this.aua >> 1);
         if (GameCanvas.aza < 320) {
            this.ava = 6;
            this.awa = (GameCanvas.aza - 3 * this.ata >> 1) - 6;
         }
      }

      super.ala = null;
      this.aya = new ca(er.eta, this, 1000, (Object)null);
      super.ama = new ca("", this, 1000, (Object)null);
      super.ana = new ca(er.daa, this, 1001, (Object)null);
      super.ala = this.aya;
      if (GameCanvas.afa) {
         super.ama = null;
         super.ala = null;
      }

      if (GameCanvas.afa && GameCanvas.aza >= 320) {
         super.ana.afa = GameCanvas.aza / 2 + 88;
         super.ana.aga = GameCanvas.baa - 26;
      }

   }

   private void aga() {
      if (this.aga[this.aaa] != null) {
         aka = this.aga[this.aaa];
         Service.aaa().aba(this.aga[this.aaa]);
         GameCanvas.aba(er.bda);
         GameCanvas.aea = true;
      } else {
         fc.aea().aaa();
      }
   }

   public final void aca() {
      super.aca();
      if (GameCanvas.aka[6]) {
         ++this.aaa;
         if (this.aaa >= 3) {
            this.aaa = 0;
         }
      }

      if (GameCanvas.aka[4]) {
         --this.aaa;
         if (this.aaa < 0) {
            this.aaa = 2;
         }
      }

      if (GameCanvas.ama && GameCanvas.aba(this.awa, this.axa, 3 * (this.ata + this.ava), this.aua)) {
         int var1;
         if ((var1 = (GameCanvas.apa - this.awa) / (this.ata + this.ava)) > 2) {
            var1 = 2;
         }

         if (var1 < 0) {
            var1 = 0;
         }

         this.aaa = var1;
      }

      if (GameCanvas.aoa) {
         if (GameCanvas.aba(this.awa, this.axa, 3 * (this.ata + this.ava), this.aua)) {
            this.aza = 5;
         } else {
            this.aaa = -1;
         }
      }

      GameCanvas.ala();
      GameCanvas.aka();
   }

   public final void aba() {
      if (++GameScr.aia > GameCanvas.aza * 3 + 100) {
         GameScr.aia = 100;
      }

      if (this.aza > 0) {
         --this.aza;
         if (this.aza == 0 && this.aaa >= 0) {
            this.aga();
         }
      }

   }

   public final void aaa() {
      TileMap.ada();
      System.gc();
      super.aaa();

      for(int var1 = 0; var1 < this.aga.length; ++var1) {
         if (this.aga[var1] != null) {
            this.aja = false;
            break;
         }
      }

      if (this.aja) {
         fc.aea().aaa();
      }

   }

   public final void aaa(as var1) {
      GameCanvas.aaa(var1);

      int var2;
      for(var2 = 0; var2 < 3; ++var2) {
         if (this.aaa == var2) {
            fk.ada(this.awa + var2 * (this.ata + this.ava), this.axa, this.ata, this.aua, var1);
         } else {
            fk.aca(this.awa + var2 * (this.ata + this.ava), this.axa, this.ata, this.aua, var1);
         }

         fk.aba(this.awa + var2 * (this.ata + this.ava), this.axa, this.ata, this.aua, var1);
      }

      for(var2 = 0; var2 < 3; ++var2) {
         if (this.aga[var2] != null) {
            fj var3 = GameScr.bba[this.aba[var2]];
            fj var4 = GameScr.bba[this.aca[var2]];
            fj var5 = GameScr.bba[this.ada[var2]];
            fj var6 = GameScr.bba[this.aea[var2]];
            int var7;
            if (var3.aaa != null && var3.aaa.length >= 8) {
               for(var7 = 0; var7 < var3.aaa.length; ++var7) {
                  if (var3.aaa[var7] == null || !fo.aaa(var3.aaa[var7].aaa)) {
                     Char.getMyChar();
                     var3 = Char.aba(this.aia[var2]);
                     break;
                  }
               }
            } else {
               Char.getMyChar();
               var3 = Char.aba(this.aia[var2]);
            }

            var7 = this.awa + var2 * (this.ata + this.ava) + this.ata / 2;
            int var8;
            if (!GameCanvas.afa) {
               var8 = this.axa + this.aua / 2 + 16;
               fo.aaa(var1, var6.aaa[Char.gda[0][3][0]].aaa, var7 + Char.gda[0][3][1] + var6.aaa[Char.gda[0][3][0]].aba, var8 - Char.gda[0][3][2] + var6.aaa[Char.gda[0][3][0]].aca, 0, 0);
               fo.aaa(var1, var3.aaa[Char.gda[0][0][0]].aaa, var7 + Char.gda[0][0][1] + var3.aaa[Char.gda[0][0][0]].aba, var8 - Char.gda[0][0][2] + var3.aaa[Char.gda[0][0][0]].aca, 0, 0);
               fo.aaa(var1, var4.aaa[Char.gda[0][1][0]].aaa, var7 + Char.gda[0][1][1] + var4.aaa[Char.gda[0][1][0]].aba, var8 - Char.gda[0][1][2] + var4.aaa[Char.gda[0][1][0]].aca, 0, 0);
               fo.aaa(var1, var5.aaa[Char.gda[0][2][0]].aaa, var7 + Char.gda[0][2][1] + var5.aaa[Char.gda[0][2][0]].aba, var8 - Char.gda[0][2][2] + var5.aaa[Char.gda[0][2][0]].aca, 0, 0);
               if (this.aaa == var2) {
                  fw.aqa.aaa(var1, er.nta[0] + ": " + this.aga[var2], GameCanvas.bba, this.axa - 45, 2);
                  fw.aga.aaa(var1, er.nta[1] + ": " + this.afa[var2], GameCanvas.bba, this.axa - 28, 2, fw.ada);
                  fw.aga.aaa(var1, this.aha[var2], GameCanvas.bba, this.axa - 16, 2, fw.ada);
               }
            } else {
               var8 = this.axa + this.aua / 2 - 5;
               fo.aaa(var1, var6.aaa[Char.gda[0][3][0]].aaa, var7 + Char.gda[0][3][1] + var6.aaa[Char.gda[0][3][0]].aba, var8 - Char.gda[0][3][2] + var6.aaa[Char.gda[0][3][0]].aca, 0, 0);
               fo.aaa(var1, var3.aaa[Char.gda[0][0][0]].aaa, var7 + Char.gda[0][0][1] + var3.aaa[Char.gda[0][0][0]].aba, var8 - Char.gda[0][0][2] + var3.aaa[Char.gda[0][0][0]].aca, 0, 0);
               fo.aaa(var1, var4.aaa[Char.gda[0][1][0]].aaa, var7 + Char.gda[0][1][1] + var4.aaa[Char.gda[0][1][0]].aba, var8 - Char.gda[0][1][2] + var4.aaa[Char.gda[0][1][0]].aca, 0, 0);
               fo.aaa(var1, var5.aaa[Char.gda[0][2][0]].aaa, var7 + Char.gda[0][2][1] + var5.aaa[Char.gda[0][2][0]].aba, var8 - Char.gda[0][2][2] + var5.aaa[Char.gda[0][2][0]].aca, 0, 0);
               fw.aqa.aaa(var1, this.aga[var2], var7, this.axa + this.aua / 2 + 5, 2);
               fw.aga.aaa(var1, er.nta[1] + ": " + this.afa[var2], var7, this.axa + this.aua / 2 + 22, 2);
               if (GameCanvas.aza > 200) {
                  fw.aga.aaa(var1, this.aha[var2], var7, this.axa + this.aua / 2 + 34, 2);
               }
            }
         }
      }

      super.aaa(var1);
   }

   public final void aaa(int var1, Object var2) {
      switch(var1) {
      case 1000:
         this.aga();
         return;
      case 1001:
         cs var3 = cs.aba();
         Code.aba();
         var3.ada();
         GameCanvas.aja.aqa();
      default:
      }
   }

   public static void afa() {
      asa = null;
      aka = null;
   }
}
