public final class dl extends fb implements ag {
   public static dl aaa;
   private int aca;
   private int ada;
   private int aea;
   private int afa;
   private int aga;
   private int aha;
   private int aia;
   private eq[] aja = new eq[7];
   private String[] aka = new String[]{"Họ và tên", "Ngày, tháng, năm sinh", "Địa chỉ thường trú", "CMND", "Ngày cấp", "Nơi cấp", "Số điện thoại, địa chỉ thư điện tử (nếu có).", "* Dưới 18 tuổi chỉ có thể chơi 180p 1 ngày"};
   private String[] asa = new String[]{"Nguyen Van A", "17-03-1991", "34 Phan A p.12 q.BT", "987654321", "01-01-2011", "TP.Hồ Chí Minh", "abc@gmail.com", ""};
   public cw aba = new cw();

   public dl() {
      aaa = this;
      this.aca = ab.bba - 100;
      this.ada = 10;
      this.aea = 200;
      this.afa = ab.baa - 40;
      this.aga = this.aea - 40;
      this.aha = ab.bba - this.aga / 2;

      for(int var1 = 0; var1 < this.aja.length; ++var1) {
         this.aja[var1] = new eq();
         this.aja[var1].aua = this.aka[var1];
         this.aja[var1].aaa = this.aha;
         this.aja[var1].aba = (var1 + 1) * 50;
         this.aja[var1].aca = this.aga;
         this.aja[var1].ada = fb.aoa + 2;
         this.aja[var1].aea = false;
         this.aja[var1].ara = 3;
         this.aja[var1].aaa(this.asa[var1]);
         if (var1 == 0) {
            this.aja[var1].aea = true;
         }
      }

      super.ala = new ca(er.dna, this, 1, (Object)null);
   }

   public final void aba() {
      super.aba();
      if (++gf.aia > ab.aza * 3 + 100) {
         gf.aia = 100;
      }

      int var1;
      for(var1 = 0; var1 < this.aja.length; ++var1) {
         this.aja[var1].ada();
      }

      new au();
      au var2;
      if ((var2 = this.aba.aba()).aaa || var2.aca) {
         this.aia = (byte)var2.aba;
      }

      this.aba.aca();
      if (this.aia == -1) {
         for(var1 = 0; var1 < this.aja.length; ++var1) {
            this.aja[var1].aea = false;
         }
      }

   }

   public final void aaa(int var1) {
      super.aaa(var1);

      for(int var2 = 0; var2 < this.aja.length; ++var2) {
         if (this.aja[var2].aea) {
            this.aja[var2].aaa(var1);
         }
      }

   }

   public final void aca() {
      if (ab.aka[2]) {
         --this.aia;
         if (this.aia < 0) {
            this.aia = this.aka.length;
         }

         this.aba.aaa(this.aia * this.aba.aha);
      } else if (ab.aka[8]) {
         ++this.aia;
         if (this.aia > this.aka.length) {
            this.aia = 0;
         }

         this.aba.aaa(this.aia * this.aba.aha);
      }

      int var1;
      if (ab.aka[2] || ab.aka[8]) {
         ab.aka();

         for(var1 = 0; var1 < this.aja.length; ++var1) {
            this.aja[var1].aea = false;
         }

         if (this.aia < this.aja.length) {
            this.aja[this.aia].aea = true;
         }

         this.aba.aaa(this.aia * this.aba.aha);
      }

      if (ab.aba(this.aca, this.ada, this.aea, this.afa) && ab.aoa) {
         for(var1 = 0; var1 < this.aja.length; ++var1) {
            if (ab.aba(this.aja[var1].aaa, this.aja[var1].aba, this.aja[var1].aca, this.aja[var1].ada)) {
               this.aia = var1;
            }
         }
      }

      super.aca();
      ab.aka();
   }

   public final void aaa(as var1) {
      var1.aaa(0);
      var1.aca(0, 0, ab.aza, ab.baa);
      ab.aaa(var1);
      fk.aaa(this.aca, this.ada, this.aea, this.afa, var1);
      fw.aga.aaa(var1, er.dna, ab.bba, this.ada + 10, 2);
      this.aba.aaa(this.aka.length, 50, this.aca, this.ada + 25, this.aea, this.afa - 25, true, 0);
      this.aba.aaa(var1, this.aca, this.ada + 25, this.aea, this.afa - 25);

      int var2;
      for(var2 = 0; var2 < this.aka.length; ++var2) {
         if (var2 != this.aka.length - 1) {
            fw.ala.aaa(var1, this.aka[var2], ab.bba, (var2 + 1) * 50 - 13, 2);
         } else {
            fw.ana.aaa(var1, this.aka[var2], ab.bba, (var2 + 1) * 50 - 13, 2);
         }
      }

      for(var2 = 0; var2 < this.aja.length; ++var2) {
         eq var3;
         boolean var5 = (var3 = this.aja[var2]).aea;
         if (var3.ara == 2) {
            var3.aka = var3.aja;
         } else {
            var3.aka = var3.aia;
         }

         if (var3.aka.equals("")) {
            var3.aka = var3.aha;
         }

         fk.aaa(var1, var5, var3.aaa, var3.aba, var3.aca, 4 + var3.aoa + var3.aaa, var3.aba + (var3.ada - fw.aqa.aaa) / 2, var3.aka);
         var1.aaa(0);
         if (var3.aea && var3.apa == 0 && (var3.aqa > 0 || var3.ama / 5 % 2 == 0)) {
            var1.aaa(11184810);
            var1.aca(5 + var3.aoa + var3.aaa + fw.aqa.aaa(var3.aka.substring(0, var3.ala)) - 1, var3.aba + (var3.ada - eq.afa) / 2 + 1, 1, eq.afa);
         }
      }

      super.aaa(var1);
   }

   public final void aaa() {
      super.aaa();
      this.aba.aaa();
   }

   public final void aaa(int var1, Object var2) {
      switch(var1) {
      case 1:
         gm var10000 = gm.aaa();
         String var8 = this.aja[6].aia;
         String var7 = this.aja[5].aia;
         String var6 = this.aja[4].aia;
         String var5 = this.aja[3].aia;
         String var4 = this.aja[2].aia;
         String var3 = this.aja[1].aia;
         String var12 = this.aja[0].aia;
         gm var11 = var10000;

         try {
            fe var9;
            (var9 = new fe((byte)123)).aca.writeUTF(var12);
            var9.aca.writeUTF(var3);
            var9.aca.writeUTF(var4);
            var9.aca.writeUTF(var5);
            var9.aca.writeUTF(var6);
            var9.aca.writeUTF(var7);
            var9.aca.writeUTF(var8);
            var11.aaa.aaa(var9);
            var9.aca();
         } catch (Exception var10) {
            var10.printStackTrace();
         }

         ab.bsa = false;
         gf.ava().aaa();
      default:
      }
   }

   public static void ada() {
   }

   static {
      aa.aaa(30);
      ada();
   }

   public static void aea() {
      aaa = null;
   }
}
