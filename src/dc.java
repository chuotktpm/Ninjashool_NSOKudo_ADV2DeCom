public final class dc {
   public ev aaa = new ev();
   static dc aba;
   public int aca = 0;
   public static boolean ada;
   public static boolean aea;
   public static boolean afa;
   public static boolean aga;
   public ev aha = new ev();

   public final void aaa() {
      ++this.aca;
      if (this.aca > this.aaa.size() - 1) {
         this.aca = 0;
      }

   }

   public final void aba() {
      --this.aca;
      if (this.aca < 0) {
         this.aca = this.aaa.size() - 1;
      }

   }

   public final void aaa(int var1) {
      this.aca = var1;
   }

   public final void aaa(fa var1) {
      this.aca = this.aaa.indexOf(var1);
   }

   public final void aca() {
      this.aca = this.aaa.size() - 1;
   }

   public static dc ada() {
      return aba == null ? (aba = new dc()) : aba;
   }

   public dc() {
      this.aaa.addElement(new fa(er.pla[0], 0));
      this.aaa.addElement(new fa(er.pma[0], 1));
      this.aaa.addElement(new fa(er.pna[0], 3));
      this.aaa.addElement(new fa(er.poa[0], 4));
      fa var1;
      (var1 = this.aaa(er.pna[0])).aaa("c8" + er.pna[1]);
      var1.aaa("c8" + er.pna[2]);
      var1.aaa("c8" + er.pna[3]);
      this.aaa(er.pma[0]).aaa("c8" + er.pma[1]);
      this.aaa(er.poa[0]).aaa("c8" + er.poa[1]);
      this.aaa(er.pla[0]).aaa("c8" + er.pla[1]);
   }

   public final fa aaa(String var1) {
      for(int var2 = 0; var2 < this.aaa.size(); ++var2) {
         fa var3;
         if ((var3 = (fa)this.aaa.elementAt(var2)).aba.equals(var1)) {
            return var3;
         }
      }

      return null;
   }

   public final void aaa(String var1, String var2, String var3) {
      fa var4;
      if ((var4 = this.aaa(var1)) == null) {
         var4 = this.aba(var1);
      }

      var4.aaa(var2, var3);
   }

   public final fa aea() {
      return (fa)this.aaa.elementAt(this.aca);
   }

   public final fa aba(String var1) {
      fa var2 = new fa(var1, 2);
      if (!ab.afa) {
         var2.aaa("c2" + er.pka);
      }

      this.aaa.addElement(var2);
      return var2;
   }

   public final void aca(String var1) {
      for(int var2 = 0; var2 < this.aha.size(); ++var2) {
         if (((String)this.aha.elementAt(var2)).equals(var1)) {
            return;
         }
      }

      this.aha.addElement(var1);
   }

   public final boolean ada(String var1) {
      for(int var2 = 0; var2 < this.aha.size(); ++var2) {
         if (((String)this.aha.elementAt(var2)).equals(var1)) {
            return true;
         }
      }

      return false;
   }

   public final void aea(String var1) {
      for(int var2 = 0; var2 < this.aha.size(); ++var2) {
         if (((String)this.aha.elementAt(var2)).equals(var1)) {
            this.aha.removeElementAt(var2);
            return;
         }
      }

   }

   private static void aha() {
      aba = null;
   }

   public static void afa() {
   }

   static {
      aa.aaa(28);
      afa();
   }

   public static void aga() {
      aba = null;
      ada = false;
      aea = false;
      afa = false;
      aga = false;
   }
}
