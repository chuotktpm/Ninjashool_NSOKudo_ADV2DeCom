

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import javax.microedition.lcdui.Image;

public final class TileMap {
   public static int a;
   public static int b;
   public static int c;
   public static int d;
   public static int e;
   public static char[] maps;
   public static int[] types;
   private static Image image1;
   private static Image image2;
   public static Image imgMiniMap;
   private static Image imgWaterfall;
   private static Image imgTopWaterfall;
   private static Image imgWaterflow;
   private static Image imgLeaf;
   private static Image imgflowRiver;
   public static byte size = 24;
   private static int ap;
   private static int aq;
   public static String mapName1 = null;
   public static String mapName = "";
   public static byte zoneID;
   public static byte bgID;
   public static byte typeMap;
   public static short mapID;
   public static short p = 0;
   private static int ar;
   private static int as;
   private static int at;
   private static int au;
   private static int av;
   private static int aw;
   private static int ax;
   private static int ay;
   public static int wMiniMap;
   public static int hMiniMap;
   public static int posMiniMapX;
   public static int posMiniMapY;
   public static MyVector vGo = new MyVector();
   public static String[] mapNames;
   public static mHashtable locationStand = new mHashtable();
   public static mHashtable itemMap = new mHashtable();
   private static int az;
   public static int y = 2;
   public static int z;
   public static int aa;
   public static int ab;
   public static int ac;
   public static int ad;
   public static int ae;
   private static int[] ba = new int[]{5257738, 8807192};
   private static short[][] bb = new short[160][];
   private static boolean[] bc = new boolean[160];
   private static int[] bd = new int[160];
   private static short[] be = new short[160];
   public static int af;
   public static boolean ag;
   public static boolean ah;
   private static Object bf;
   private static byte[][] bg;
   private static Image[] bh;
   private static Image[] bi;

   static {
      bb[0] = new short[]{27};
      bb[1] = new short[]{2, 3, 27, 72, 91, 94, 105, 114, 125, 157, 139, 113, 80};
      bb[2] = new short[]{6, 1};
      bb[3] = new short[]{1, 4};
      bb[4] = new short[]{3, 5};
      bb[5] = new short[]{7, 4};
      bb[6] = new short[]{7, 2, 20, 21};
      bb[7] = new short[]{6, 5, 8};
      bb[8] = new short[]{7, 9};
      bb[9] = new short[]{8, 10};
      bb[10] = new short[]{9, 11, 17, 22, 32, 38, 43, 48, 139};
      bb[11] = new short[]{12, 10};
      bb[12] = new short[]{11, 57};
      bb[13] = new short[]{57, 14};
      bb[14] = new short[]{13, 15};
      bb[15] = new short[]{14, 16};
      bb[16] = new short[]{15, 17};
      bb[17] = new short[]{16, 18, 10, 22, 32, 38, 43, 48, 139};
      bb[18] = new short[]{17, 19};
      bb[19] = new short[]{18, 58};
      bb[20] = new short[]{6};
      bb[21] = new short[]{22, 6};
      bb[22] = new short[]{23, 21, 10, 17, 32, 38, 43, 48, 139};
      bb[23] = new short[]{22, 69, 25};
      bb[24] = new short[]{59, 36};
      bb[25] = new short[]{23, 26};
      bb[26] = new short[]{27, 25};
      bb[27] = new short[]{26, 28, 1, 72, 91, 94, 105, 114, 125, 157, 139, 113, 80};
      bb[28] = new short[]{27, 60};
      bb[29] = new short[]{60, 30};
      bb[30] = new short[]{29, 31};
      bb[31] = new short[]{32, 30};
      bb[32] = new short[]{31, 61, 10, 17, 22, 38, 43, 48, 139};
      bb[33] = new short[]{61, 34};
      bb[34] = new short[]{35, 33};
      bb[35] = new short[]{34, 66};
      bb[36] = new short[]{37, 24};
      bb[37] = new short[]{36};
      bb[38] = new short[]{67, 68, 10, 17, 22, 32, 43, 48, 139};
      bb[39] = new short[]{72, 46, 40};
      bb[40] = new short[]{39, 65, 41};
      bb[41] = new short[]{42, 40, 43};
      bb[42] = new short[]{62, 41};
      bb[43] = new short[]{41, 44, 10, 17, 22, 32, 38, 48, 139};
      bb[44] = new short[]{43, 45};
      bb[45] = new short[]{44, 53};
      bb[46] = new short[]{63, 39, 47};
      bb[47] = new short[]{46, 48};
      bb[48] = new short[]{47, 50, 10, 17, 22, 32, 38, 43, 139};
      bb[49] = new short[]{50, 51};
      bb[50] = new short[]{48, 49};
      bb[51] = new short[]{52, 49};
      bb[52] = new short[]{51, 64};
      bb[53] = new short[]{54, 45};
      bb[54] = new short[]{55, 53};
      bb[55] = new short[]{54};
      bb[56] = new short[]{72};
      bb[57] = new short[]{12, 13};
      bb[58] = new short[]{19};
      bb[59] = new short[]{68, 24};
      bb[60] = new short[]{28, 29};
      bb[61] = new short[]{33, 32};
      bb[62] = new short[]{42};
      bb[63] = new short[]{46};
      bb[64] = new short[]{52};
      bb[65] = new short[]{40};
      bb[66] = new short[]{67, 35};
      bb[67] = new short[]{66, 38};
      bb[68] = new short[]{59, 38};
      bb[69] = new short[]{70, 23};
      bb[70] = new short[]{69, 71};
      bb[71] = new short[]{72, 70};
      bb[72] = new short[]{71, 39, 1, 27, 91, 94, 105, 114, 125, 157, 139, 113, 80};
      bb[73] = new short[]{1};
      bb[74] = new short[0];
      bb[75] = new short[0];
      bb[76] = new short[0];
      bb[77] = new short[0];
      bb[78] = new short[0];
      bb[79] = new short[0];
      bb[80] = new short[]{81, 82, 83};
      bb[81] = new short[]{80, 84};
      bb[82] = new short[]{80, 85};
      bb[83] = new short[]{80, 86};
      bb[84] = new short[]{81, 87};
      bb[85] = new short[]{82, 88};
      bb[86] = new short[]{83, 89};
      bb[87] = new short[]{84, 90};
      bb[88] = new short[]{85, 90};
      bb[89] = new short[]{86, 90};
      bb[90] = new short[0];
      bb[91] = new short[]{92};
      bb[92] = new short[]{91, 93};
      bb[93] = new short[]{92};
      bb[94] = new short[]{95};
      bb[95] = new short[]{94, 96};
      bb[96] = new short[]{95, 97};
      bb[97] = new short[]{96};
      bb[98] = new short[]{99};
      bb[99] = new short[]{98, 101, 100, 102};
      bb[100] = new short[]{99, 103};
      bb[101] = new short[]{99, 103};
      bb[102] = new short[]{99, 103};
      bb[103] = new short[]{101, 102, 104, 100};
      bb[104] = new short[]{103};
      bb[105] = new short[]{107, 106, 108};
      bb[106] = new short[]{105, 109};
      bb[107] = new short[]{105, 109};
      bb[108] = new short[]{105, 109};
      bb[109] = new short[]{106, 107, 108};
      bb[110] = new short[0];
      bb[111] = new short[0];
      bb[112] = new short[]{113};
      bb[113] = new short[]{112};
      bb[114] = new short[]{115};
      bb[115] = new short[]{114, 116};
      bb[116] = new short[]{115};
      bb[117] = new short[0];
      bb[118] = new short[0];
      bb[119] = new short[0];
      bb[120] = new short[0];
      bb[121] = new short[0];
      bb[122] = new short[0];
      bb[123] = new short[0];
      bb[124] = new short[0];
      bb[125] = new short[]{126};
      bb[126] = new short[]{125, 127};
      bb[127] = new short[]{126, 128};
      bb[128] = new short[]{127};
      bb[129] = new short[0];
      bb[130] = new short[0];
      bb[131] = new short[0];
      bb[132] = new short[0];
      bb[133] = new short[0];
      bb[134] = new short[]{138};
      bb[135] = new short[]{138};
      bb[136] = new short[]{138};
      bb[137] = new short[]{138};
      bb[138] = new short[]{Class_cn.d, 135, 136, 137};
      bb[139] = new short[]{140};
      bb[140] = new short[]{139, 141};
      bb[141] = new short[]{140, 142};
      bb[142] = new short[]{141, 143};
      bb[143] = new short[]{142, 144};
      bb[144] = new short[]{143, 145};
      bb[145] = new short[]{144, 146};
      bb[146] = new short[]{145, 147};
      bb[147] = new short[]{146, 148};
      bb[148] = new short[]{147};
      bb[149] = new short[0];
      bb[150] = new short[0];
      bb[151] = new short[0];
      bb[152] = new short[0];
      bb[153] = new short[0];
      bb[154] = new short[0];
      bb[155] = new short[0];
      bb[156] = new short[0];
      bb[157] = new short[]{158, 159};
      bb[158] = new short[]{159, 157};
      bb[159] = new short[]{157, 158};
      af = -1;
      ag = false;
      ah = false;
      bf = new Object();
      bg = new byte[160][];

      for(int var0 = 0; var0 < 160; ++var0) {
         int var1 = var0;
         InputStream var2 = null;

         try {
            var2 = "".getClass().getResourceAsStream("/map/" + var1);
            bg[var1] = new byte[var2.available()];
            var2.read(bg[var1]);
            var2.close();
         } catch (Exception var9) {
            var9.printStackTrace();
         } finally {
            try {
               var2.close();
            } catch (Exception var8) {
            }

         }
      }

      bh = new Image[5];
      bi = new Image[5];
   }

   public static void a(int var0, int var1, int var2, int var3) {
      wMiniMap = var2;
      hMiniMap = var3;
      posMiniMapX = var0;
      posMiniMapY = var1;
   }

   public static void a() {
      av = Char.getMyChar().cx / 12;
      ar = Char.getMyChar().cy / 12;
      if (av > a * y - wMiniMap / 2) {
         av = a * y - wMiniMap;
      } else if (av < wMiniMap / 2) {
         av = 0;
      } else {
         av -= wMiniMap / 2;
      }

      if (ar < hMiniMap / 2) {
         ar = 0;
      } else {
         ar -= hMiniMap / 2;
      }

      if (ar > b * y - hMiniMap) {
         ar = b * y - hMiniMap;
      }

   }

   public static void b() {
      if (a * y >= wMiniMap || b * y >= hMiniMap) {
         if (as != ar) {
            au = ar - as << 2;
            at += au;
            as += at >> 4;
            at &= 15;
         }

         if (aw != av) {
            ay = av - aw << 2;
            ax += ay;
            aw += ax >> 4;
            ax &= 15;
         }
      }

   }

   public static void c() {
      image1 = null;
      System.gc();
   }

   static final void d() {
      if (imgLeaf == null) {
         imgLeaf = GameCanvas.loadImage("/t/uwt.png");
      }

      if (imgWaterfall == null) {
         imgWaterfall = GameCanvas.loadImage("/t/wtf.png");
      }

      if (imgTopWaterfall == null) {
         imgTopWaterfall = GameCanvas.loadImage("/t/twtf.png");
      }

      if (imgWaterflow == null) {
         imgWaterflow = GameCanvas.loadImage("/t/wts.png");
      }

      if (imgflowRiver == null) {
         imgflowRiver = GameCanvas.loadImage("/t/wts1.png");
      }

      System.gc();
   }

   public static void a(int var0) {
      d = b * size;
      c = a * size;

      try {
         for(int var1 = 0; var1 < a * b; ++var1) {
            int[] var10000;
            if (locationStand != null && locationStand.get(String.valueOf(var1)) != null) {
               var10000 = types;
               var10000[var1] |= 2;
            }

            if (var0 == 4) {
               if (maps[var1] == 1 || maps[var1] == 2 || maps[var1] == 3 || maps[var1] == 4 || maps[var1] == 5 || maps[var1] == 6 || maps[var1] == '\t' || maps[var1] == '\n' || maps[var1] == 'O' || maps[var1] == 'P' || maps[var1] == '\r' || maps[var1] == 14 || maps[var1] == '+' || maps[var1] == ',' || maps[var1] == '-' || maps[var1] == '2') {
                  var10000 = types;
                  var10000[var1] |= 2;
               }

               if (maps[var1] == '\t' || maps[var1] == 11) {
                  var10000 = types;
                  var10000[var1] |= 4;
               }

               if (maps[var1] == '\n' || maps[var1] == '\f') {
                  var10000 = types;
                  var10000[var1] |= 8;
               }

               if (maps[var1] == '\r' || maps[var1] == 14) {
                  var10000 = types;
                  var10000[var1] |= 1024;
               }

               if (maps[var1] == 'L' || maps[var1] == 'M') {
                  var10000 = types;
                  var10000[var1] |= 64;
                  if (maps[var1] == 'N') {
                     var10000 = types;
                     var10000[var1] |= 4096;
                  }
               }
            }

            if (var0 == 1) {
               if (maps[var1] == 22) {
                  az = maps[var1] - 1;
               }

               if (maps[var1] == 1 || maps[var1] == 2 || maps[var1] == 3 || maps[var1] == 4 || maps[var1] == 5 || maps[var1] == 6 || maps[var1] == 7 || maps[var1] == '$' || maps[var1] == '%' || maps[var1] == '6' || maps[var1] == '[' || maps[var1] == '\\' || maps[var1] == ']' || maps[var1] == '^' || maps[var1] == 'I' || maps[var1] == 'J' || maps[var1] == 'a' || maps[var1] == 'b' || maps[var1] == 't' || maps[var1] == 'u' || maps[var1] == 'v' || maps[var1] == 'x' || maps[var1] == '=') {
                  var10000 = types;
                  var10000[var1] |= 2;
               }

               if (maps[var1] == 2 || maps[var1] == 3 || maps[var1] == 4 || maps[var1] == 5 || maps[var1] == 6 || maps[var1] == 20 || maps[var1] == 21 || maps[var1] == 22 || maps[var1] == 23 || maps[var1] == '$' || maps[var1] == '%' || maps[var1] == '&' || maps[var1] == '\'' || maps[var1] == '=') {
                  var10000 = types;
                  var10000[var1] |= 4096;
               }

               if (maps[var1] == '\b' || maps[var1] == '\t' || maps[var1] == '\n' || maps[var1] == '\f' || maps[var1] == '\r' || maps[var1] == 14 || maps[var1] == 30) {
                  var10000 = types;
                  var10000[var1] |= 16;
               }

               if (maps[var1] == 17) {
                  var10000 = types;
                  var10000[var1] |= 32;
               }

               if (maps[var1] == 18) {
                  var10000 = types;
                  var10000[var1] |= 128;
               }

               if (maps[var1] == '%' || maps[var1] == '&' || maps[var1] == '=') {
                  var10000 = types;
                  var10000[var1] |= 4;
               }

               if (maps[var1] == '$' || maps[var1] == '\'' || maps[var1] == '=') {
                  var10000 = types;
                  var10000[var1] |= 8;
               }

               if (maps[var1] == 19) {
                  var10000 = types;
                  var10000[var1] |= 64;
                  if ((types[var1 - a] & 4096) == 4096) {
                     var10000 = types;
                     var10000[var1] |= 4096;
                  }
               }

               if (maps[var1] == '#') {
                  var10000 = types;
                  var10000[var1] |= 2048;
               }

               if (maps[var1] == 7) {
                  var10000 = types;
                  var10000[var1] |= 1024;
               }

               if (maps[var1] == ' ' || maps[var1] == '!' || maps[var1] == '"') {
                  var10000 = types;
                  var10000[var1] |= 256;
               }
            }

            if (var0 == 2) {
               if (maps[var1] == 22 || maps[var1] == 'g' || maps[var1] == 'o') {
                  az = maps[var1] - 1;
               }

               if (maps[var1] == 1 || maps[var1] == 2 || maps[var1] == 3 || maps[var1] == 4 || maps[var1] == 5 || maps[var1] == 6 || maps[var1] == 7 || maps[var1] == '$' || maps[var1] == '%' || maps[var1] == '6' || maps[var1] == '=' || maps[var1] == 'I' || maps[var1] == 'L' || maps[var1] == 'M' || maps[var1] == 'N' || maps[var1] == 'O' || maps[var1] == 'R' || maps[var1] == 'S' || maps[var1] == 'b' || maps[var1] == 'c' || maps[var1] == 'd' || maps[var1] == 'f' || maps[var1] == 'g' || maps[var1] == 'l' || maps[var1] == 'm' || maps[var1] == 'n' || maps[var1] == 'p' || maps[var1] == 'q' || maps[var1] == 't' || maps[var1] == 'u' || maps[var1] == '}' || maps[var1] == '~' || maps[var1] == 127 || maps[var1] == 129 || maps[var1] == 130) {
                  var10000 = types;
                  var10000[var1] |= 2;
               }

               if (maps[var1] == 1 || maps[var1] == 3 || maps[var1] == 4 || maps[var1] == 5 || maps[var1] == 6 || maps[var1] == 20 || maps[var1] == 21 || maps[var1] == 22 || maps[var1] == 23 || maps[var1] == '$' || maps[var1] == '%' || maps[var1] == '&' || maps[var1] == '\'' || maps[var1] == '7' || maps[var1] == 'm' || maps[var1] == 'o' || maps[var1] == 'p' || maps[var1] == 'q' || maps[var1] == 'r' || maps[var1] == 's' || maps[var1] == 't' || maps[var1] == 127 || maps[var1] == 129 || maps[var1] == 130) {
                  var10000 = types;
                  var10000[var1] |= 4096;
               }

               if (maps[var1] == '\b' || maps[var1] == '\t' || maps[var1] == '\n' || maps[var1] == '\f' || maps[var1] == '\r' || maps[var1] == 14 || maps[var1] == 30 || maps[var1] == 135) {
                  var10000 = types;
                  var10000[var1] |= 16;
               }

               if (maps[var1] == 17) {
                  var10000 = types;
                  var10000[var1] |= 32;
               }

               if (maps[var1] == 18) {
                  var10000 = types;
                  var10000[var1] |= 128;
               }

               if (maps[var1] == '=' || maps[var1] == '%' || maps[var1] == '&' || maps[var1] == 127 || maps[var1] == 130 || maps[var1] == 131) {
                  var10000 = types;
                  var10000[var1] |= 4;
               }

               if (maps[var1] == '=' || maps[var1] == '$' || maps[var1] == '\'' || maps[var1] == 127 || maps[var1] == 129 || maps[var1] == 132) {
                  var10000 = types;
                  var10000[var1] |= 8;
               }

               if (maps[var1] == 19) {
                  var10000 = types;
                  var10000[var1] |= 64;
                  if ((types[var1 - a] & 4096) == 4096) {
                     var10000 = types;
                     var10000[var1] |= 4096;
                  }
               }

               if (maps[var1] == 134) {
                  var10000 = types;
                  var10000[var1] |= 64;
                  if ((types[var1 - a] & 4096) == 4096) {
                     var10000 = types;
                     var10000[var1] |= 4096;
                  }
               }

               if (maps[var1] == '#') {
                  var10000 = types;
                  var10000[var1] |= 2048;
               }

               if (maps[var1] == 7) {
                  var10000 = types;
                  var10000[var1] |= 1024;
               }

               if (maps[var1] == ' ' || maps[var1] == '!' || maps[var1] == '"') {
                  var10000 = types;
                  var10000[var1] |= 256;
               }

               if (maps[var1] == '=' || maps[var1] == 127) {
                  var10000 = types;
                  var10000[var1] |= 8192;
               }
            }

            if (var0 == 3) {
               if (maps[var1] == '\f' || maps[var1] == '3' || maps[var1] == 'X' || maps[var1] == 't' || maps[var1] == 128) {
                  az = maps[var1] - 1;
               }

               if (maps[var1] == 'm' || maps[var1] == 'n') {
                  az = maps[var1];
               }

               if (maps[var1] == 1 || maps[var1] == 2 || maps[var1] == 3 || maps[var1] == 4 || maps[var1] == 5 || maps[var1] == 6 || maps[var1] == 7 || maps[var1] == 11 || maps[var1] == 14 || maps[var1] == 17 || maps[var1] == '+' || maps[var1] == '3' || maps[var1] == '?' || maps[var1] == 'A' || maps[var1] == 'C' || maps[var1] == 'D' || maps[var1] == 'G' || maps[var1] == 'H' || maps[var1] == 'S' || maps[var1] == 'T' || maps[var1] == 'U' || maps[var1] == 'W' || maps[var1] == '[' || maps[var1] == '^' || maps[var1] == 'a' || maps[var1] == 'b' || maps[var1] == 'j' || maps[var1] == 'k' || maps[var1] == 'o' || maps[var1] == 'q' || maps[var1] == 'u' || maps[var1] == 'v' || maps[var1] == 'w' || maps[var1] == '}' || maps[var1] == '~' || maps[var1] == 129 || maps[var1] == 130 || maps[var1] == 131 || maps[var1] == 133 || maps[var1] == 136 || maps[var1] == 138 || maps[var1] == 139 || maps[var1] == 142) {
                  var10000 = types;
                  var10000[var1] |= 2;
               }

               if (maps[var1] == '|' || maps[var1] == 't' || maps[var1] == '{' || maps[var1] == ',' || maps[var1] == '\f' || maps[var1] == 15 || maps[var1] == 16 || maps[var1] == '-' || maps[var1] == '\n' || maps[var1] == '\t') {
                  var10000 = types;
                  var10000[var1] |= 4096;
               }

               if (maps[var1] == 23) {
                  var10000 = types;
                  var10000[var1] |= 32;
               }

               if (maps[var1] == 24) {
                  var10000 = types;
                  var10000[var1] |= 128;
               }

               if (maps[var1] == 6 || maps[var1] == 15 || maps[var1] == '3' || maps[var1] == '_' || maps[var1] == 'a' || maps[var1] == 'j' || maps[var1] == 'o' || maps[var1] == '{' || maps[var1] == '}' || maps[var1] == 138 || maps[var1] == 140) {
                  var10000 = types;
                  var10000[var1] |= 4;
               }

               if (maps[var1] == 7 || maps[var1] == 16 || maps[var1] == '3' || maps[var1] == '`' || maps[var1] == 'b' || maps[var1] == 'k' || maps[var1] == 'o' || maps[var1] == '|' || maps[var1] == '~' || maps[var1] == 139 || maps[var1] == 141) {
                  var10000 = types;
                  var10000[var1] |= 8;
               }

               if (maps[var1] == 25) {
                  var10000 = types;
                  var10000[var1] |= 64;
                  if ((types[var1 - a] & 4096) == 4096) {
                     var10000 = types;
                     var10000[var1] |= 4096;
                  }
               }

               if (maps[var1] == '"') {
                  var10000 = types;
                  var10000[var1] |= 2048;
               }

               if (maps[var1] == 17) {
                  var10000 = types;
                  var10000[var1] |= 1024;
               }

               if (maps[var1] == '!' || maps[var1] == 'g' || maps[var1] == 'h' || maps[var1] == 'i' || maps[var1] == 26 || maps[var1] == '!') {
                  var10000 = types;
                  var10000[var1] |= 256;
               }

               if (maps[var1] == '3' || maps[var1] == 'o' || maps[var1] == 'D') {
                  var10000 = types;
                  var10000[var1] |= 8192;
               }

               if (maps[var1] == 'R' || maps[var1] == 'n' || maps[var1] == 143) {
                  var10000 = types;
                  var10000[var1] |= 16384;
               }

               if (maps[var1] == 'q') {
                  var10000 = types;
                  var10000[var1] |= 65536;
               }

               if (maps[var1] == 142) {
                  var10000 = types;
                  var10000[var1] |= 32768;
               }

               if (maps[var1] == '(' || maps[var1] == ')') {
                  var10000 = types;
                  var10000[var1] |= 131072;
               }

               if (maps[var1] == 'n') {
                  var10000 = types;
                  var10000[var1] |= 262144;
               }

               if (maps[var1] == 143) {
                  var10000 = types;
                  var10000[var1] |= 524288;
               }
            }
         }

         imgMiniMap = Image.createImage(a * y * mGraphics.zoomLevel, b * y * mGraphics.zoomLevel);
         mGraphics var6;
         (var6 = new mGraphics(imgMiniMap.getGraphics())).setColor(0);
         var6.fillRect(0, 0, a * y, b * y);

         for(var0 = 0; var0 < a; ++var0) {
            for(int var2 = 0; var2 < b; ++var2) {
               int var3;
               if ((var3 = maps[var2 * a + var0] - 1) != -1) {
                  var6.drawRegion(image2, 0, var3 * y, y, y, 0, var0 * y, var2 * y, 0);
               }
            }
         }

         if (!GameCanvas.lowGraphic) {
            if (mapID == 0 || mapID <= 4 || mapID >= 16 && mapID <= 18 || mapID >= 24 && mapID <= 27 || mapID == 22 || mapID == 33 || mapID == 34 || mapID == 38 || mapID == 57 || mapID == 58 || mapID == 60 || mapID == 68 || mapID >= 70 && mapID <= 75 || mapID == 81) {
               Class_bc.f.addElement(new Class_av((byte)1, 10));
            }

            if (mapID >= 39 && mapID <= 44 || mapID >= 46 && mapID <= 48 || mapID == 56 || mapID >= 62 && mapID <= 65) {
               Class_bc.f.addElement(new Class_av((byte)3, Class_fa.b(150, 200)));
               return;
            }
         }
      } catch (Exception var4) {
         System.out.println("Error Load Map");
         var4.printStackTrace();
         GameMidlet var5 = GameMidlet.instance;
         MotherCanvas.c = false;
         System.gc();
         var5.notifyDestroyed();
      }

   }

   public static final void a(mGraphics var0) {
      for(int var1 = GameScr.m; var1 < GameScr.o; ++var1) {
         for(int var2 = GameScr.n; var2 < GameScr.p; ++var2) {
            int var3 = maps[var2 * a + var1] - 1;
            if ((g(var1, var2) & 256) != 256) {
               if (e == 4 && (g(var1, var2) & 64) == 64) {
                  var3 = var2 - 1;
                  if ((var3 = maps[var3 * a + var1] - 1) == 15) {
                     var0.drawRegion(image1, 0, 17 * size, 24, 24, 0, var1 * size, var2 * size, 0);
                     continue;
                  }

                  if (var3 == 5) {
                     var0.drawRegion(image1, 0, 7 * size, 24, 24, 0, var1 * size, var2 * size, 0);
                     continue;
                  }

                  if (var3 == 18 || var3 == 22 || var3 == 15) {
                     var0.drawRegion(image1, 0, 17 * size, 24, 24, 0, var1 * size, var2 * size, 0);
                     continue;
                  }

                  if (var3 == 44 || var3 == 52 || var3 == 51) {
                     var0.drawRegion(image1, 0, 56 * size, 24, 24, 0, var1 * size, var2 * size, 0);
                     continue;
                  }

                  if (var3 == 24 || var3 == 23 || var3 == 20 || var3 == 21 || var3 == 19 || var3 == 12 || var3 == 13) {
                     continue;
                  }

                  if (var3 != -1) {
                     var0.drawRegion(image1, 0, var3 * size, 24, 24, 0, var1 * size, var2 * size, 0);
                  } else if (var3 == -1) {
                     continue;
                  }
               }

               if (e == 1) {
                  if ((g(var1, var2) & 32) == 32) {
                     var0.drawRegion(imgWaterfall, 0, 24 * (GameCanvas.gameTick % 4), 24, 24, 0, var1 * size, var2 * size, 0);
                     continue;
                  }

                  if ((g(var1, var2) & 64) == 64 || (g(var1, var2) & 2048) == 2048) {
                     if ((g(var1, var2 - 1) & 32) == 32) {
                        var0.drawRegion(imgWaterfall, 0, 24 * (GameCanvas.gameTick % 4), 24, 24, 0, var1 * size, var2 * size, 0);
                        continue;
                     }

                     if ((g(var1, var2 - 1) & 4096) == 4096) {
                        var0.drawRegion(image1, 0, 504, 24, 24, 0, var1 * size, var2 * size, 0);
                        continue;
                     }
                  }
               }

               if (e == 2) {
                  if ((g(var1, var2) & 32) == 32) {
                     var0.drawRegion(imgWaterfall, 0, 24 * (GameCanvas.gameTick % 8 >> 1), 24, 24, 0, var1 * size, var2 * size, 0);
                     continue;
                  }

                  if (var3 == 17) {
                     var0.drawRegion(imgTopWaterfall, 0, 24 * (GameCanvas.gameTick % 8 >> 1), 24, 24, 0, var1 * size, var2 * size, 0);
                     continue;
                  }

                  if (var3 == 133) {
                     var0.drawRegion(image1, 0, 132 * size, 24, 24, 0, var1 * size, var2 * size, 0);
                     continue;
                  }

                  if ((g(var1, var2) & 64) == 64 || (g(var1, var2) & 2048) == 2048) {
                     if ((g(var1, var2 - 1) & 32) == 32) {
                        var0.drawRegion(imgWaterfall, 0, 24 * (GameCanvas.gameTick % 4), 24, 24, 0, var1 * size, var2 * size, 0);
                        continue;
                     }

                     if ((g(var1, var2 - 1) & 4096) == 4096) {
                        if ((var3 = f(var1, var2 - 1)) == 55) {
                           var3 = 54;
                        } else if (var3 != 19 && var3 != 35) {
                           if (var3 < 40) {
                              var3 = 21;
                           } else {
                              var3 = 110;
                           }
                        } else if ((var3 = f(var1, var2 - 2)) == 55) {
                           var3 = 54;
                        } else if (var3 < 40) {
                           var3 = 21;
                        }

                        var0.drawRegion(image1, 0, var3 * 24, 24, 24, 0, var1 * size, var2 * size, 0);
                        continue;
                     }
                  }
               }

               if (e == 3) {
                  if ((g(var1, var2) & 32) == 32) {
                     var0.drawRegion(imgWaterfall, 0, 24 * (GameCanvas.gameTick % 8 >> 1), 24, 24, 0, var1 * size, var2 * size, 0);
                     continue;
                  }

                  if (var3 == 23) {
                     var0.drawRegion(imgTopWaterfall, 0, 24 * (GameCanvas.gameTick % 8 >> 1), 24, 24, 0, var1 * size, var2 * size, 0);
                     continue;
                  }

                  if ((g(var1, var2) & 64) == 64 || (g(var1, var2) & 2048) == 2048) {
                     if ((g(var1, var2 - 1) & 32) == 32) {
                        var0.drawRegion(imgWaterfall, 0, 24 * (GameCanvas.gameTick % 4), 24, 24, 0, var1 * size, var2 * size, 0);
                        continue;
                     }

                     if ((g(var1, var2 - 1) & 4096) == 4096) {
                        if ((var3 = f(var1, var2 - 1)) == 25) {
                           var3 = f(var1, var2 - 2);
                        }

                        if (var3 == 45) {
                           var3 = 44;
                        }

                        --var3;
                        var0.drawRegion(image1, 0, var3 * 24, 24, 24, 0, var1 * size, var2 * size, 0);
                        continue;
                     }
                  }
               }

               if ((g(var1, var2) & 16) == 16) {
                  ap = var1 * size - GameScr.i - GameScr.d;
                  aq = (size - 2) * ap / size + GameScr.d;
                  var0.drawRegion(image1, 0, var3 * size, 24, 24, 0, aq + GameScr.i, var2 * size, 0);
               } else if ((g(var1, var2) & 512) == 512) {
                  if (var3 != -1) {
                     var0.drawRegion(image1, 0, var3 * size, 24, 1, 0, var1 * size, var2 * size, 0);
                     var0.drawRegion(image1, 0, var3 * size, 24, 24, 0, var1 * size, var2 * size + 1, 0);
                  }
               } else if (var3 != -1) {
                  var0.drawRegion(image1, 0, var3 * size, 24, 24, 0, var1 * size, var2 * size, 0);
               }
            }
         }
      }

   }

   public static final void b(mGraphics var0) {
      if (GameCanvas.width > 176) {
         Class_fa.a(var0);
         var0.translateXY(posMiniMapX + 1, posMiniMapY + 2);
         var0.setColor(0);
         var0.fillRect(-2, -2, wMiniMap + 2, hMiniMap);
         var0.setClip(-2, -2, wMiniMap + 4, hMiniMap + 4);

         int var1;
         for(var1 = 0; var1 < 2; ++var1) {
            var0.setColor(ba[var1]);
            var0.drawRect(var1 - 2, var1 - 2, wMiniMap + 2 - (var1 << 1), hMiniMap - (var1 << 1));
         }

         var0.setClip(0, 0, wMiniMap - 2, hMiniMap - 3);
         if (mGraphics.getWidth(imgMiniMap) > wMiniMap || mGraphics.getHeight(imgMiniMap) > hMiniMap) {
            var0.translateXY(-aw, -as);
         }

         var0.drawImage(imgMiniMap, 0, 0, 0);

         int var2;
         int var3;
         for(var3 = 0; var3 < Auto.t.size(); ++var3) {
            Mob var4;
            var1 = (var4 = (Mob)Auto.t.elementAt(var3)).e / 12;
            var2 = var4.f / 12;
            if (var1 < ay) {
               var1 = ay;
            }

            if (var2 < au) {
               var2 = au;
            }

            if (var1 > ay + wMiniMap) {
               var1 = ay + wMiniMap;
            }

            if (var2 > au + hMiniMap) {
               var2 = au + hMiniMap;
            }

            if (GameCanvas.gameTick % 10 < 8) {
               var0.setColor(16777215);
               var0.fillRect(var1 - 2, var2 - 2, 5, 5);
               var0.setColor(var4.w == 1 ? 255 : (var4.w == 2 ? 16711935 : '\uffff'));
               var0.fillRect(var1 - 1, var2 - 1, 3, 3);
            }
         }

         var1 = Char.getMyChar().cx / 12;
         var2 = Char.getMyChar().cy / 12;
         var0.setColor(16777215);
         var0.fillRect(var1 - 2, var2 - 2, 5, 5);
         var0.setColor(16711680);
         var0.fillRect(var1 - 1, var2 - 1, 3, 3);
         if (Code.q) {
            for(var3 = 0; var3 < Code.s.size(); ++var3) {
               var1 = ((Integer)Code.s.elementAt(var3)).intValue() / 12;
               var2 = ((Integer)Code.t.elementAt(var3)).intValue() / 12;
               if (Code.r == var3) {
                  var0.setColor(16777215);
                  var0.fillRect(var1 - 2, var2 - 2, 5, 5);
               }

               var0.setColor(16777215);
               var0.fillRect(var1 - 1, var2 - 1, 3, 3);
            }
         }

         for(var3 = 0; var3 < GameScr.vParty.size(); ++var3) {
            Party var5;
            if ((var5 = (Party)GameScr.vParty.elementAt(var3)).f != null && var5.f != Char.getMyChar()) {
               var1 = var5.f.cx / 12;
               var2 = var5.f.cy / 12;
               if (var1 < ay) {
                  var1 = ay;
               }

               if (var2 < au) {
                  var2 = au;
               }

               if (var1 > ay + wMiniMap) {
                  var1 = ay + wMiniMap;
               }

               if (var2 > au + hMiniMap) {
                  var2 = au + hMiniMap;
               }

               if (GameCanvas.gameTick % 10 < 8) {
                  var0.setColor(16777215);
                  var0.fillRect(var1 - 2, var2 - 2, 5, 5);
                  var0.setColor(65280);
                  var0.fillRect(var1 - 1, var2 - 1, 3, 3);
               }
            }
         }

         Class_fa.a(var0);
         if (GameCanvas.isTouch) {
            var0.drawImage(GameScr.dr, posMiniMapX - 1, posMiniMapY, 0);
         }
      }

   }

   public static final void c(mGraphics var0) {
      if (!GameCanvas.lowGraphic) {
         int var1;
         int var2;
         for(var1 = GameScr.m; var1 < GameScr.o; ++var1) {
            for(var2 = GameScr.n; var2 < GameScr.p; ++var2) {
               Image var3;
               if (e == 4) {
                  var3 = imgflowRiver;
               } else {
                  var3 = imgWaterflow;
               }

               if ((g(var1, var2) & 2048) == 2048) {
                  var0.drawImage(imgLeaf, var1, var2, 0);
               }

               if ((g(var1, var2) & 64) == 64) {
                  var0.drawRegion(var3, 0, (GameCanvas.gameTick % 8 >> 2) * 24, 24, 24, 0, var1 * size, var2 * size, 0);
               }

               if ((g(var1, var2) & 256) == 256) {
                  var0.drawRegion(image1, 0, (maps[var2 * a + var1] - 1) * size, 24, 24, 0, var1 * size, var2 * size, 0);
               }
            }
         }

         if (e != 4 && GameCanvas.isTouch && GameCanvas.g && GameScr.p >= b - 2) {
            for(var1 = GameScr.m; var1 < GameScr.o; ++var1) {
               var2 = b - 2;
               int var5 = maps[var2 * a + var1] - 1;
               int var4;
               if ((g(var1, var2) & 32) == 32) {
                  for(var4 = 1; var4 <= 4; ++var4) {
                     var0.drawRegion(imgWaterfall, 0, 24 * (GameCanvas.gameTick % 4), 24, 24, 0, var1 * size, (var2 + var4) * size, 0);
                  }
               } else {
                  if (mapID == 64) {
                     az = 115;
                  }

                  if ((g(var1, var2) & 2) == 2 || (g(var1, var2) & 64) == 64) {
                     var5 = az;
                  }

                  if (var5 >= 0) {
                     for(var4 = 1; var4 <= 4; ++var4) {
                        var0.drawRegion(image1, 0, var5 * size, 24, 24, 0, var1 * size, (var2 + var4) * size, 0);
                     }
                  }
               }
            }
         }
      }

   }

   private static int f(int var0, int var1) {
      try {
         return maps[var1 * a + var0];
      } catch (Exception var2) {
         return 1000;
      }
   }

   private static int g(int var0, int var1) {
      try {
         return types[var1 * a + var0];
      } catch (Exception var2) {
         return 1000;
      }
   }

   public static final int a(int var0, int var1) {
      try {
         return types[var1 / size * a + var0 / size];
      } catch (Exception var2) {
         return 1000;
      }
   }

   public static final boolean a(int var0, int var1, int var2) {
      try {
         return (types[var1 / size * a + var0 / size] & var2) == var2;
      } catch (Exception var3) {
         return false;
      }
   }

   public static final void b(int var0, int var1) {
      int[] var10000 = types;
      int var10001 = var1 / size * a + var0 / size;
      var10000[var10001] |= 512;
   }

   public static final void c(int var0, int var1) {
      int[] var10000 = types;
      int var10001 = var1 / size * a + var0 / size;
      var10000[var10001] &= -513;
   }

   public static final int b(int var0) {
      return var0 / size * size;
   }

   public static final int c(int var0) {
      return var0 / size * size;
   }

   public static void e() {
      if (p != mapID) {
         switch (mapID) {
            case 1:
               return;
            case 10:
               return;
            case 17:
               return;
            case 22:
               return;
            case 27:
               return;
            case 32:
               return;
            case 38:
               return;
            case 43:
               return;
            case 48:
               return;
            case 72:
               return;
         }
      }

   }

   public static void f() {
      if (GameCanvas.gameTick % 700 == 0 && mapID != 0 && mapID > 4 && (mapID < 16 || mapID > 18) && (mapID < 24 || mapID > 27) && mapID != 22 && mapID != 33 && mapID != 34 && mapID != 38 && mapID != 57 && mapID != 58 && mapID != 60 && mapID != 68 && (mapID < 70 || mapID > 75) && mapID != 81) {
         if (mapID >= 39 && mapID <= 44 || mapID >= 46 && mapID <= 48 || mapID == 56 || mapID >= 62 && mapID <= 65) {
            return;
         }

         if (mapID == 29 || mapID == 35) {
            return;
         }

         if (mapID == 50 || mapID == 51 || mapID == 52) {
            return;
         }

         if (mapID == 64) {
            if (Class_fa.b(0, 8) % 2 == 0) {
               return;
            }

            return;
         }
      }

   }

   public static boolean d(int var0) {
      return var0 == 10 || var0 == 17 || var0 == 22 || var0 == 32 || var0 == 38 || var0 == 43 || var0 == 48 || var0 == 138;
   }

   public static boolean e(int var0) {
      return var0 >= 134 && var0 <= 138;
   }

   public static boolean f(int var0) {
      return var0 == 1 || var0 == 22 || var0 == 27 || var0 == 72;
   }

   public static boolean g(int var0) {
      return var0 == 91 || var0 == 92 || var0 == 93 || var0 == 94 || var0 == 95 || var0 == 96 || var0 == 97 || var0 == 105 || var0 == 106 || var0 == 107 || var0 == 108 || var0 == 109 || var0 == 114 || var0 == 115 || var0 == 116 || var0 == 125 || var0 == 126 || var0 == 127 || var0 == 128 || var0 == 157 || var0 == 158 || var0 == 159;
   }

   public static int h(int var0) {
      if (g(var0)) {
         switch (var0) {
            case 91:
               return 92;
            case 92:
               return 93;
            case 94:
               return 95;
            case 95:
               return 96;
            case 96:
               return 97;
            case 105:
               return 106;
            case 106:
               return 107;
            case 107:
               return 108;
            case 108:
               return 109;
            case 114:
               return 115;
            case 115:
               return 116;
            case 125:
               return 126;
            case 126:
               return 127;
            case 127:
               return 128;
            case 157:
               return 158;
            case 158:
               return 159;
            case 159:
               return 157;
         }
      }

      return -1;
   }

   public static int i(int var0) {
      if (g(var0)) {
         switch (var0) {
            case 92:
               return 91;
            case 93:
               return 92;
            case 95:
               return 94;
            case 96:
               return 95;
            case 97:
               return 96;
            case 106:
               return 105;
            case 107:
               return 106;
            case 108:
               return 107;
            case 109:
               return 108;
            case 115:
               return 114;
            case 116:
               return 115;
            case 126:
               return 125;
            case 127:
               return 126;
            case 128:
               return 127;
            case 158:
               return 157;
            case 159:
               return 158;
         }
      }

      return -1;
   }

   public static void j(int var0) {
       try {
           Class_ds var3;
           int var1 = (var3 = (Class_ds)vGo.elementAt(var0)).a;
           int var2 = var3.b;
           if (var3.b != 0 && var3.d < d - 24) {
               if (var3.c <= c / 2) {
                   var1 = var3.c + 12;
                   var2 = var3.d;
               } else if (var3.a >= c / 2) {
                   var1 = var3.a - 12;
                   var2 = var3.d;
               }
           } else if (var3.d <= d / 2) {
               var1 = (var3.c + var3.a) / 2;
               var2 = var3.d + 24;
           } else if (var3.b >= d / 2) {
               var1 = (var3.c + var3.a) / 2 + 24;
               var2 = var3.d - 48;
           }
           
           if (mapID != 114 && mapID != 115 && mapID != 116) {
               Char.c(var1, var2);
           } else {
               Char.e(var1, var2);
           }
           
           Thread.sleep(10L);
           Service.getInstance().c();
       } catch (InterruptedException ex) {
           
       }
   }

   public static void g() {
      ah = true;
      synchronized(bf) {
         try {
            bf.wait(10000L);
         } catch (InterruptedException var1) {
         }

      }
   }

   public static void h() {
      if (ah) {
         ah = false;
         synchronized(bf) {
            bf.notifyAll();
         }
      }
   }

   public static boolean k(int var0) {
      short var10000 = mapID;
      af = var0;
      int var2 = var0;
      short var1 = var10000;
      int var4;
      int var5;
      int var6;
      MyVector var21;
      if (var10000 >= 0 && var1 < bb.length && var0 >= 0 && var0 < bb.length) {
         if (bb[var1].length <= 0) {
            var21 = null;
         } else {
            TaskOrder var3 = Char.l(0);

            for(var4 = 0; var4 < bc.length; ++var4) {
               bc[var4] = true;
               bd[var4] = -1;
               be[var4] = -1;
            }

            bd[var1] = 0;

            label381:
            while(true) {
               do {
                  do {
                     int var7;
                     if (!bc[var2]) {
                        MyVector var17;
                        (var17 = new MyVector()).addElement(new Integer(var2));

                        for(var6 = var2; var6 != var1; var6 = be[var6]) {
                           byte var19;
                           if (d(var7 = be[var6])) {
                              if (d(var6) && var6 != 138) {
                                 var19 = 1;
                                 if (var6 == 10) {
                                    var19 = 1;
                                 } else if (var6 == 17) {
                                    var19 = 2;
                                 } else if (var6 == 22) {
                                    var19 = 3;
                                 } else if (var6 == 32) {
                                    var19 = 4;
                                 } else if (var6 == 38) {
                                    var19 = 5;
                                 } else if (var6 == 43) {
                                    var19 = 6;
                                 } else if (var6 == 48) {
                                    var19 = 7;
                                 }

                                 var7 = var7 | Integer.MIN_VALUE | 117440512 | var19 << 20 & 15728640;
                              } else if (var6 == 139) {
                                 var7 = var7 | Integer.MIN_VALUE | 83886080 | 2097152;
                              }
                           } else if (f(var7)) {
                              if (f(var6)) {
                                 var19 = 0;
                                 if (var6 == 1) {
                                    var19 = 0;
                                 } else if (var6 == 27) {
                                    var19 = 1;
                                 } else if (var6 == 72) {
                                    var19 = 2;
                                 }

                                 var7 = var7 | Integer.MIN_VALUE | 134217728 | var19 << 20 & 15728640;
                              } else {
                                 int var18;
                                 if (var3 != null && var6 == var3.mapId) {
                                    var18 = GameScr.fj;
                                    var7 = var7 | Integer.MIN_VALUE | 419430400 | var18 << 20 & 15728640 | 196608;
                                 } else {
                                    switch (var6) {
                                       case 80:
                                          var7 = var7 | Integer.MIN_VALUE | 1048576 | 65536;
                                          break;
                                       case 91:
                                          var7 = var7 | Integer.MIN_VALUE | 2097152 | 65536;
                                          break;
                                       case 94:
                                          var7 = var7 | Integer.MIN_VALUE | 2097152 | 131072;
                                          break;
                                       case 98:
                                          var18 = GameScr.fj + 2;
                                          var7 = var7 | Integer.MIN_VALUE | 419430400 | var18 << 20 & 15728640;
                                          break;
                                       case 104:
                                          var18 = GameScr.fj + 2;
                                          var7 = var7 | Integer.MIN_VALUE | 419430400 | var18 << 20 & 15728640 | 65536;
                                          break;
                                       case 105:
                                          var7 = var7 | Integer.MIN_VALUE | 2097152 | 196608;
                                          break;
                                       case 113:
                                          var18 = GameScr.fj + 3;
                                          var7 = var7 | Integer.MIN_VALUE | 419430400 | var18 << 20 & 15728640;
                                          break;
                                       case 114:
                                          var7 = var7 | Integer.MIN_VALUE | 2097152 | 262144;
                                          break;
                                       case 125:
                                          var7 = var7 | Integer.MIN_VALUE | 2097152 | 327680;
                                          break;
                                       case 139:
                                          var7 = var7 | Integer.MIN_VALUE | 83886080 | 2097152;
                                          break;
                                       case 157:
                                          var7 = var7 | Integer.MIN_VALUE | 2097152 | 393216;
                                    }
                                 }
                              }
                           }

                           var17.addElement(new Integer(var7));
                        }

                        MyVector var20 = new MyVector();

                        for(var4 = var17.size() - 1; var4 >= 0; --var4) {
                           var20.addElement(var17.elementAt(var4));
                        }

                        var21 = var20;
                        break label381;
                     }

                     var5 = -1;
                     var6 = -1;

                     for(var4 = 0; var4 < bb.length; ++var4) {
                        if (bc[var4] && bd[var4] != -1 && (bd[var4] < var5 || var5 == -1)) {
                           var5 = bd[var4];
                           var6 = (short)var4;
                        }
                     }

                     if (var6 == -1) {
                        var21 = null;
                        break label381;
                     }

                     bc[var6] = false;
                     boolean var16 = f(var6);
                     short[] var8 = bb[var6];

                     for(var4 = 0; var4 < var8.length; ++var4) {
                        var7 = var8[var4];
                        if (bc[var7]) {
                           boolean var22;
                           label345: {
                              if (Char.getMyChar().isHuman) {
                                 int var10 = Char.getMyChar().ctaskId;
                                 if ((var7 == 1 || var7 == 27 || var7 == 72) && var10 < 6) {
                                    var22 = false;
                                    break label345;
                                 }

                                 // if ((var7 == 10 || var7 == 32 || var7 == 48) && var10 < 17) {
                                 //    var22 = false;
                                 //    break label345;
                                 // }

                                 // if (var7 == 38 && var10 < 28) {
                                 //    var22 = false;
                                 //    break label345;
                                 // }

                                 // if (var7 == 43 && var10 < 33) {
                                 //    var22 = false;
                                 //    break label345;
                                 // }

                                 // if (var7 == 17 && var10 < 38) {
                                 //    var22 = false;
                                 //    break label345;
                                 // }

                                 // if (var7 == 7 && var10 < 15) {
                                 //    var22 = false;
                                 //    break label345;
                                 // }
                              }

                              var22 = true;
                           }

                           if (var22 && (!var16 || !f(var7) || Char.getMyChar().ctaskId >= 9) && (bd[var7] == -1 || bd[var7] > bd[var6] + 1)) {
                              bd[var7] = bd[var6] + 1;
                              be[var7] = (short)var6;
                           }
                        }
                     }

                     if (var16 && var3 != null && bc[var3.mapId] && (bd[var3.mapId] == -1 || bd[var3.mapId] > bd[var6] + 1)) {
                        bd[var3.mapId] = bd[var6] + 1;
                        be[var3.mapId] = (short)var6;
                     }

                     if (var16) {
                        var7 = (short)(GameScr.fk ? 98 : 104);
                        if (bd[var7] == -1 || bd[var7] > bd[var6] + 1) {
                           bd[var7] = bd[var6] + 1;
                           be[var7] = (short)var6;
                        }
                     }
                  } while(!Char.eo);
               } while(bd[138] != -1 && bd[138] <= bd[var6] + 1);

               bd[138] = bd[var6] + 1;
               be[138] = (short)var6;
            }
         }
      } else {
         var21 = null;
      }

      MyVector var12 = var21;
      if (var21 == null) {
         InfoMe.a("Kh\u00f4ng th\u1ec3 chuy\u1ec3n map!", 50, mFont.tahoma_7_yellow);
         return false;
      } else {
         ag = true;

         try {
            var6 = mapID;

            for(var2 = 1; var2 < var12.size() && ag && var6 == mapID; ++var2) {
               var5 = ((Integer)var12.elementAt(var2 - 1)).intValue();
               var6 = ((Integer)var12.elementAt(var2)).intValue() & '\uffff';
               int var14;
               if (var5 < 0) {
                  var14 = var5 >> 24 & 127;
                  var4 = var5 >> 20 & 15;
                  var5 = var5 >> 16 & 15;
                  GameScr.PickNpc(var14, var4, var5);
               } else if ((var5 < 134 || var5 > 138) && var6 == 138) {
                  if (Char.getMyChar().hieuChien > 0) {
                     InfoMe.a("Hi\u1ebfu chi\u1ebfn qu\u00e1 cao!", 50, mFont.tahoma_7_yellow);
                     return false;
                  }

                  Item var15;
                  if ((var15 = Char.g(490)) == null || var15.template.id != 490) {
                     if (Char.ep && Char.getMyChar().luong >= 10) {
                        Service.getInstance().buyItem1(14, 28, 2);
                        LockGame.g();
                        return false;
                     }

                     InfoMe.a("Kh\u00f4ng \u0111\u1ee7 c\u1ed5 l\u1ec7nh!", 50, mFont.tahoma_7_yellow);
                     return false;
                  }

                  System.out.println("Dung co lenh");
                  Service.getInstance().useItem(var15.indexUI);
               } else if (var5 != 0 && var5 != 56 && var5 != 73) {
                  var4 = -1;

                  for(var14 = 0; var14 < bb[var5].length; ++var14) {
                     if (bb[var5][var14] == var6) {
                        var4 = var14;
                        break;
                     }
                  }

                  if (var4 == -1) {
                     InfoMe.a("Kh\u00f4ng th\u1ec3 chuy\u1ec3n map!", 50, mFont.tahoma_7_yellow);
                     return false;
                  }

                  j(var4);
               } else {
                  Npc var13;
                  if ((var13 = (Npc)GameScr.ah.elementAt(0)) != null && var13.r != 15) {
                     Char.c(var13.cx, var13.cy);
                     Char.getMyChar().npcFocus = var13;
                     Service.getInstance().requestItem(var13.template.npcTemplateId);
                     Service.getInstance().menu(var13.template.npcTemplateId, 0, 0);
                     Service.getInstance().getTask(var13.template.npcTemplateId, 0);
                  }
               }

               if (mapID != var6) {
                  g();
               }

               Thread.sleep(100L);
            }
         } catch (Exception var11) {
            var11.printStackTrace();
            return false;
         }

         ag = false;
         return mapID == var0;
      }
   }

   public static void l(int var0) {
      GameCanvas.o();
      (new Thread(new Class_fe(var0))).start();
   }

   public static void m(int var0) {
      GameCanvas.o();
      (new Thread(new Class_ff(var0))).start();
   }

   public static int d(int var0, int var1) {
      var1 = b(var1);
      if (!a(var0, var1, 2)) {
         for(int var2 = 0; var2 < 7; ++var2) {
            int var3;
            if ((var3 = var1 - 48 + var2 * 24) > 0 && var3 < d && a(var0, var3, 2)) {
               return var3;
            }
         }
      }

      return var1;
   }

   public static int e(int var0, int var1) {
      if ((a(var0, var1 - 16) & 16386) != 0) {
         var1 = b(var1);

         int var2;
         int var3;
         for(var2 = 24; var2 < 240; var2 += 24) {
            var3 = a(var0, var1 - var2);
            if (var1 - var2 > 0 && (var3 & 16386) == 0) {
               return var1 - var2 + 24;
            }
         }

         for(var2 = 24; var2 < 120; var2 += 24) {
            var3 = a(var0, var1 + var2);
            if (var1 + var2 < d && (var3 & 16386) == 0) {
               return var1 + var2;
            }
         }
      }

      return var1;
   }

   public static boolean a(int var0, int var1, int[] var2) {
      var1 = b(var1);
      if (a(var0, var1, 2)) {
         var2[0] = var0;
         var2[1] = var1;
         return true;
      } else {
         for(int var3 = 0; var3 < 5; ++var3) {
            int var4 = var1 + var3 * 24;

            for(int var5 = 0; var5 < 5; ++var5) {
               int var6 = var0 - 48 + var5 * 24;
               if (var4 < d && var6 > 24 && var6 < c - 24 && a(var6, var4, 2)) {
                  var2[0] = var6;
                  var2[1] = var4;
                  return true;
               }
            }
         }

         return false;
      }
   }

   public static void a(int var0, InputStream var1) {
      try {
         if (bg.length <= var0) {
            byte[][] var2 = new byte[var0 + 10][];
            System.arraycopy(bg, 0, var2, 0, bg.length);
            bg = var2;
         }

         bg[var0] = new byte[var1.available()];
         var1.read(bg[var0]);
      } catch (Exception var3) {
      }
   }

   public static void i() {
       try {
           ByteArrayInputStream var0 = new ByteArrayInputStream(bg[mapID]);
           DataInputStream var2;
           a = (char)(var2 = new DataInputStream(var0)).readUnsignedByte();
           b = (char)var2.readUnsignedByte();
           maps = new char[var2.available()];
           
           for(int var1 = 0; var1 < a * b; ++var1) {
               maps[var1] = (char)var2.readUnsignedByte();
           }
           
           types = new int[maps.length];
       } catch (IOException ex) {
           
       }
   }

   public static void j() {
      for(int var0 = 1; var0 < bh.length; ++var0) {
         bh[var0] = GameCanvas.loadImage("/t/" + var0 + ".png");
         bi[var0] = GameCanvas.loadImage("/t/mini_" + var0 + ".png");
      }

   }

   public static void k() {
      image1 = null;
      System.gc();
      image1 = bh[e];
      image2 = bi[e];
   }
   public static boolean ana(int var0) {
      return var0 == 10 || var0 == 17 || var0 == 22 || var0 == 32 || var0 == 38 || var0 == 43 || var0 == 48 || var0 == 138 || var0 == 1 || var0 == 27 || var0 == 72;
   }
}
