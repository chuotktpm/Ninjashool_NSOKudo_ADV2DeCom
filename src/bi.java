public final class bi implements Runnable {
   private cs aaa;

   bi(cs var1) {
      this.aaa = var1;
   }

   public final void run() {
      try {
         while(this.aaa.afa) {
            byte var1 = this.aaa.aca.readByte();
            if (cs.aga(this.aaa)) {
               var1 = cs.aaa(this.aaa, var1);
            }

            byte var2;
            byte var3;
            int var8;
            if (var1 == -32) {
               var1 = this.aaa.aca.readByte();
               if (cs.aga(this.aaa)) {
                  var1 = cs.aaa(this.aaa, var1);
               }

               var2 = cs.aaa(this.aaa, this.aaa.aca.readByte());
               var3 = cs.aaa(this.aaa, this.aaa.aca.readByte());
               byte var4 = cs.aaa(this.aaa, this.aaa.aca.readByte());
               byte var5 = cs.aaa(this.aaa, this.aaa.aca.readByte());
               var8 = (var2 & 255) << 24 | (var3 & 255) << 16 | (var4 & 255) << 8 | var5 & 255;
            } else if (cs.aga(this.aaa)) {
               var2 = this.aaa.aca.readByte();
               var3 = this.aaa.aca.readByte();
               var8 = (cs.aaa(this.aaa, var2) & 255) << 8 | cs.aaa(this.aaa, var3) & 255;
            } else {
               var8 = this.aaa.aca.readUnsignedShort();
            }

            byte[] var10 = new byte[var8];
            int var12 = 0;
            int var6 = 0;

            int var11;
            while(var6 != -1 && var12 < var8) {
               if ((var6 = this.aaa.aca.read(var10, var12, var8 - var12)) > 0) {
                  var12 += var6;
                  cs var10000 = this.aaa;
                  var10000.aia += var12 + 5;
                  var11 = this.aaa.aia + this.aaa.aha;
                  this.aaa.ala = var11 / 1024 + "." + var11 % 1024 / 102 + "Kb";
               }
            }

            if (cs.aga(this.aaa)) {
               for(var11 = 0; var11 < var10.length; ++var11) {
                  var10[var11] = cs.aaa(this.aaa, var10[var11]);
               }
            }

            this.aaa.aja = System.currentTimeMillis();
            fe var9;
            if ((var9 = new fe(var1, var10)).aaa == -27) {
               this.aaa(var9);
            } else {
               this.aaa.ada.aaa(var9);
            }
         }

      } catch (Exception var7) {
         if (this.aaa.afa) {
            if (this.aaa.aea != null) {
               this.aaa.ada();
            }

            if (this.aaa.ada != null) {
               if (System.currentTimeMillis() - cs.aha(this.aaa) > 500L) {
                  this.aaa.ada.aba();
                  return;
               }

               this.aaa.ada.aaa();
            }
         }

      }
   }

   private void aaa(fe var1) {
      byte var2 = var1.ada.readByte();
      this.aaa.aka = new byte[var2];

      int var3;
      for(var3 = 0; var3 < var2; ++var3) {
         this.aaa.aka[var3] = var1.ada.readByte();
      }

      for(var3 = 0; var3 < this.aaa.aka.length - 1; ++var3) {
         byte[] var10000 = this.aaa.aka;
         var10000[var3 + 1] ^= this.aaa.aka[var3];
      }

      cs.aia(this.aaa);
   }
}
