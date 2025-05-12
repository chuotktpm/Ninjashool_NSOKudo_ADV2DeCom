public final class dj {
   public String aaa = "";
   public int aba;
   public int aca;
   public int ada;
   public int aea;
   public int afa;
   public int aga;
   public int aha;
   public int aia;
   public String aja = "";
   public String aka = "";
   public String ala = "";
   public String ama = "";
   public int ana;
   public int aoa;
   public gg[] apa;

   public dj() {
      new ev();
   }

   public final void aaa(String var1) {
      String[] var8 = ex.aaa(var1, "\n");
      this.ala = "";

      try {
         for(int var2 = 0; var2 < var8.length; ++var2) {
            String var3;
            if (!(var3 = var8[var2].trim()).equals("")) {
               try {
                  String[] var9;
                  String var4 = (var9 = ex.aaa(var3, ","))[0];
                  int var5;
                  if ((var5 = Integer.parseInt(var9[1])) == 0) {
                     var4 = "c0".concat(String.valueOf(var4));
                     var4 = var4 + er.nma[1] + " " + ex.aaa(var9[2]) + " " + er.nma[0] + " " + var9[3];
                  } else if (var5 == 1) {
                     var4 = "c1".concat(String.valueOf(var4));
                     var4 = var4 + " " + er.nma[2] + " " + ex.aaa(var9[2]) + " " + er.nma[0] + " " + var9[3];
                  } else if (var5 == 2) {
                     var4 = "c2".concat(String.valueOf(var4));
                     var4 = var4 + " " + er.nma[3] + " " + ex.aaa(var9[2]) + " " + er.nma[0] + " " + var9[3];
                  } else if (var5 == 3) {
                     var4 = "c1".concat(String.valueOf(var4));
                     var4 = var4 + " " + er.nma[4] + " " + ex.aaa(var9[2]) + " " + er.nma[0] + " " + var9[3];
                  } else if (var5 == 4) {
                     var4 = "c1".concat(String.valueOf(var4));
                     var4 = var4 + er.nma[5] + " " + ex.aaa(var9[2]) + " " + er.nma[0] + " " + var9[3];
                  } else if (var5 == 5) {
                     var4 = "c2".concat(String.valueOf(var4));
                     var4 = var4 + " " + er.nma[6] + " " + ex.aaa(var9[2]) + " " + er.nma[0] + " " + var9[3];
                  }

                  this.ala = this.ala + var4 + "\n";
               } catch (Exception var6) {
               }
            }
         }

      } catch (Exception var7) {
      }
   }
}
