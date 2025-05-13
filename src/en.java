public final class en extends cu {
   private int[] aaa = new int[]{16579837, 11188220};
   private ev aba = new ev();
   private ev[] aga;
   private er aha;
   private long aia = 0L;
   private boolean aja = false;
   private boolean aka = true;
   private int ala = 0;
   private int ama = 0;
   private int ana = 0;
   private int aoa = 7;

   public static void aaa(ev var0, er var1, int var2) {
      en var3;
      (var3 = new en()).aaa[1] = var2;

      for(var2 = 0; var2 < var0.size(); ++var2) {
         er var4;
         if ((var4 = (er)var0.elementAt(var2)) != null && (ci.aea(var4.aaa - var1.aaa) >= 100 || ci.aea(var4.aba - var1.aba) >= 50)) {
            var0.removeElementAt(var2);
         }
      }

      var3.aaa(var0, var1, true);
      cu.aca.addElement(var3);
   }

   private void aaa(ev var1, er var2, boolean var3) {
      if (var1.size() != 0) {
         this.aja = var3;
         ev var4;
         int var5;
         int var6;
         er var7;
         int var8;
         er var9;
         if (!var3) {
            var4 = var1;
            var5 = var1.size();

            for(var6 = 0; var6 < var5 - 1; ++var6) {
               var7 = (er)var4.elementAt(var6);

               for(var8 = var6 + 1; var8 < var5; ++var8) {
                  var9 = (er)var4.elementAt(var8);
                  if (var7.aaa > var9.aaa) {
                     var4.setElementAt(var7, var8);
                     var4.setElementAt(var9, var6);
                     var7 = var9;
                  }
               }
            }
         }

         this.aba = var1;
         this.aha = var2;
         this.aga = new ev[var1.size()];

         int var17;
         for(var17 = 0; var17 < this.aga.length; ++var17) {
            this.aga[var17] = new ev();
         }

         var2.aca = -1;
         this.aga[0].addElement(var2);
         var17 = -1;

         int var10;
         int var13;
         int var14;
         int var15;
         int var16;
         er var18;
         int var19;
         int var20;
         er var22;
         for(var5 = 0; var5 < var1.size(); ++var5) {
            var10 = var2.aaa;
            int var11 = var2.aba;
            if (var3 && var17 != -1) {
               var10 = (var18 = (er)var1.elementAt(var17)).aaa;
               var11 = var18.aba;
            }

            if (var3) {
               ++var17;
            } else {
               var4 = var1;
               var6 = 0;

               for(var19 = 0; var19 < var4.size(); ++var19) {
                  if (((er)var4.elementAt(var19)).ada == -1) {
                     ++var6;
                  }
               }

               int var12;
               label97: {
                  if (var6 != 0) {
                     var6 = ci.ada(var6);
                     var19 = 0;

                     for(var8 = 0; var8 < var4.size(); ++var8) {
                        if ((var9 = (er)var4.elementAt(var8)).ada == -1) {
                           if (var6 == var19) {
                              var9.ada = 0;
                              var12 = var8;
                              break label97;
                           }

                           ++var19;
                        }
                     }
                  }

                  var12 = -1;
               }

               var17 = var12;
            }

            var6 = this.aga[var17].size() - 1;
            var8 = ci.aaa((var7 = (er)var1.elementAt(var17)).aaa - var10, -(var7.aba - var11));
            var13 = ci.ada(15) + 10;
            var20 = 0;

            while(true) {
               var14 = 0;
               if (var20 != 0) {
                  var14 = var8 - 5 + ci.ada(10);
               }

               var14 = ci.aca(var14);
               var15 = var13 * var20 * ci.aba(var14) >> 10;
               var16 = -(var13 * var20 * ci.aaa(var14)) >> 10;
               var22 = new er(var10 + var15, var11 + var16, var6++);
               this.aga[var17].addElement(var22);
               if (ci.aaa(var10, var11, var10 + var15, var11 + var16) >= ci.aaa(var10, var11, var7.aaa, var7.aba) - 20) {
                  break;
               }

               ++var20;
            }
         }

         for(var5 = 0; var5 < this.aga.length; ++var5) {
            var10 = this.aga[var5].size();
            er var21;
            (var21 = (er)var1.elementAt(var5)).aca = (byte)(this.aga[var5].size() - 1);
            var21.ada = -1;
            (var18 = new er(var21.aaa, var21.aba, var21.aca)).ada = -1;
            this.aga[var5].addElement(var18);

            for(var19 = 1; var19 < var10; ++var19) {
               var22 = (er)this.aga[var5].elementAt(var19);
               var13 = ci.ada(2);

               for(var20 = 0; var20 < var13; ++var20) {
                  var14 = 180 + ci.ada(180);
                  var16 = (var15 = 5 + ci.ada(10)) * ci.aba(ci.aca(var14)) >> 10;
                  var14 = -(var15 * ci.aaa(ci.aca(var14))) >> 10;
                  (var2 = new er(var22.aaa + var16, var22.aba + var14, var19)).ada = 0;
                  this.aga[var5].addElement(var2);
               }
            }
         }
      }

   }

   public final void aba() {
      if (this.aha == null) {
         cu.ada.addElement(this);
      } else {
         try {
            if (GameCanvas.aua % 2 == 1) {
               this.aha.aca = -1;
               this.aha.ada = -1;

               for(int var1 = 0; var1 < this.aba.size(); ++var1) {
                  er var2;
                  (var2 = (er)this.aba.elementAt(var1)).ada = -1;
                  var2.aca = -1;
               }

               if (this.aja && this.aka && this.aba.size() > 1 && System.currentTimeMillis() / 10L - this.aia > 30L) {
                  this.aia = System.currentTimeMillis() / 10L;
                  this.aha = (er)this.aba.elementAt(0);
                  this.aba.removeElementAt(0);
               }

               this.aaa(this.aba, this.aha, this.aja);
               if (this.ala > 3) {
                  this.aoa = 7;
                  cu.aca.removeElement(this);
               }

               ++this.ala;
               return;
            }
         } catch (Exception var3) {
            var3.printStackTrace();
         }

      }
   }

   public final void aaa(as var1) {
      this.ana = 0;
      if (++this.ama >= 12) {
         this.ama = 0;
      }

      if (this.aga != null) {
         for(int var2 = 0; var2 < this.aga.length; ++var2) {
            for(int var3 = 0; var3 < this.aga[var2].size(); ++var3) {
               er var4;
               if ((var4 = (er)this.aga[var2].elementAt(var3)).aca >= 0 && var4.aca < this.aga[var2].size()) {
                  er var5 = (er)this.aga[var2].elementAt(var4.aca);
                  if (GameCanvas.aea(var4.aaa, var4.aba) && GameCanvas.aea(var5.aaa, var5.aba)) {
                     var1.aaa(this.aaa[0]);
                     var1.aaa(var4.aaa, var4.aba, var5.aaa, var5.aba);
                     if (var4.ada == -1) {
                        var1.aaa(this.aaa[1]);
                        var1.aaa(var4.aaa - 1, var4.aba, var5.aaa - 1, var5.aba);
                        if (this.aja && this.aka) {
                           var1.aaa(var4.aaa + 1, var4.aba, var5.aaa + 1, var5.aba);
                        }
                     }
                  }

                  if (this.aja && this.aka) {
                     ++this.ana;
                     if (this.ana >= this.aoa) {
                        this.aoa += 7;
                        return;
                     }
                  }
               }
            }
         }
      }

   }
}
