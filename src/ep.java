public final class ep {
   public int aaa;
   public int aba;
   public short aca;
   public String ada;
   public boolean aea;
   public fz afa;
   public int aga;

   public ep(byte var1, int var2, String var3, int var4) {
      switch(var1) {
      case 0:
         this.aca = 647;
         break;
      case 1:
         this.aca = 1182;
         break;
      case 2:
         this.aca = 1181;
         break;
      case 3:
         this.aca = 643;
         break;
      case 4:
         this.aca = 645;
         break;
      case 5:
         this.aca = 676;
         break;
      case 6:
         this.aca = 1119;
      }

      this.ada = var3;
      this.aba = var2;
      this.aga = var4;
   }

   public ep(int var1, byte var2, String var3, boolean var4) {
      this.aaa = var1;
      this.aea = var4;
      switch(var2) {
      case 0:
         this.aca = 647;
         break;
      case 1:
         this.aca = 1182;
         break;
      case 2:
         this.aca = 1181;
         break;
      case 3:
         this.aca = 643;
         break;
      case 4:
         this.aca = 645;
         break;
      case 5:
         this.aca = 676;
         break;
      case 6:
         this.aca = 1119;
      }

      this.ada = var3;
      if (var1 == fz.ala().asa) {
         this.afa = fz.ala();
      } else {
         this.afa = gf.aea(var1);
      }
   }

   public static void aaa() {
      for(int var0 = 0; var0 < gf.bfa.size(); ++var0) {
         ep var1;
         if ((var1 = (ep)gf.bfa.elementAt(var0)).aaa != fz.ala().asa) {
            var1.afa = gf.aea(var1.aaa);
         }
      }

   }

   public static void aaa(int var0) {
      for(int var1 = 0; var1 < gf.bfa.size(); ++var1) {
         ep var2;
         if ((var2 = (ep)gf.bfa.elementAt(var1)).aaa == var0) {
            var2.afa = null;
            return;
         }
      }

   }
}
