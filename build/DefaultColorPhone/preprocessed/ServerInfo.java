
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import javax.microedition.io.Connector;
import javax.microedition.io.HttpConnection;

public class ServerInfo {    
    public static int[] listPort;
    public static String[] listIP;
    public static int[] serverIndex;
    public static String[] listName;
    public static byte[] listTypeArea;
    public static String arrServerDefault;
    public static String endpointUpdateServer;
    
    static {
        arrServerDefault = new String(new char[]{
            'N', 'S', 'O', ' ', 'K', 'u', 'd', 'o', ':', 
            's', 'v', '1', '.', 'n', 's', 'o', 'k', 'u', 'd', 'o', '.', 'c', 'o', 'm', ':', 
            '1', '4', '4', '4', '4', ':', 
            '0', ':',
            '0',
            ',',
            '*', ':', 
            'l', 'o', 'c', 'a', 'l', 'h', 'o', 's', 't', ':', 
            '1', '4', '4', '4', '4', ':', 
            '0', ':',
            '0'});
        endpointUpdateServer = new String(new char[]{
            'h', 't', 't', 'p', 's', ':', '/', '/', 
            'n', 's', 'o', 'k', 'u', 'd', 'o', '.', 'c', 'o', 'm', '/', 
            'i', 'p', 's', 'v', '.', 't', 'x', 't'});
    }
    public ServerInfo() {
    }
    
    
    
    public static String[] split(String input, String character, int n) {
        String[] stringArray;
        int n2 = input.indexOf(character);
        if (n2 >= 0) {
            stringArray = ServerInfo.split(input.substring(n2 + character.length()), character, n + 1);
        } else {
            stringArray = new String[n + 1];
            n2 = input.length();
        }
        stringArray[n] = input.substring(0, n2);
        return stringArray;
    }
    
    public static String httpGet(String endpoint) {
        StringBuffer result = new StringBuffer();
        HttpConnection httpConnection = null;
        InputStream openInputStream = null;
        InputStreamReader reader = null;

        try {
            httpConnection = (HttpConnection) Connector.open(endpoint);
            if (httpConnection.getResponseCode() != 200) {
                return null;
            }
            openInputStream = httpConnection.openInputStream();
            reader = new InputStreamReader(openInputStream, new String(new char[]{'U', 'T', 'F', '-', '8'}));

            int read;
            char[] buffer = new char[256];
            while ((read = reader.read(buffer)) != -1) {
                result.append(buffer, 0, read);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
                if (openInputStream != null) {
                    openInputStream.close();
                }
                if (httpConnection != null) {
                    httpConnection.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return result.toString();
    }
    
    public static boolean updateListServer() {
        String string = ServerInfo.httpGet(endpointUpdateServer);
        if (string.equals(new String(new char[]{})) || string == null) {
            readListServerDefault();
            return false;
        }
        String[] stringArray = ServerInfo.split(string.trim(), new String(new char[]{','}), 0);
        ServerInfo.listName = new String[stringArray.length];
        ServerInfo.listIP = new String[stringArray.length];
        ServerInfo.listPort = new int[stringArray.length];
        ServerInfo.listTypeArea = new byte[stringArray.length];
        ServerInfo.serverIndex = new int[stringArray.length];
        int n = 0;
        while (n < stringArray.length) {
            String[] stringArray2 = ServerInfo.split(stringArray[n].trim(), new String(new char[]{':'}), 0);
            if(stringArray2.length != 5){
                readListServerDefault();
                return false;
            }
            ServerInfo.listName[n] = stringArray2[0];
            ServerInfo.listIP[n] = stringArray2[1];
            ServerInfo.listPort[n] = Integer.parseInt(stringArray2[2]);
            ServerInfo.listTypeArea[n] = Byte.parseByte(stringArray2[3]);
            ServerInfo.serverIndex[n] = n;
            ++n;
        }
        ServerInfo.writeListServerInfo();
        return true;
    }
    
    public static void readListServerInfo() {
        try {
            ByteArrayInputStream var0 = new ByteArrayInputStream(RMS.getRecord(new String(new char[]{'a', 'b', 'c', 'd', 'i', 'p'})));
            DataInputStream var1 = new DataInputStream(var0);
            if (var0.available() > 0) {
                int lenght = var1.readInt();
                ServerInfo.listName = new String[lenght];
                ServerInfo.listIP = new String[lenght];
                ServerInfo.listPort = new int[lenght];
                ServerInfo.listTypeArea = new byte[lenght];
                ServerInfo.serverIndex = new int[lenght];

                for (int i = 0; i < lenght; ++i) {
                    ServerInfo.listName[i] = var1.readUTF();
                    ServerInfo.listIP[i] = var1.readUTF();
                    ServerInfo.listPort[i] = var1.readInt();
                    ServerInfo.listTypeArea[i] = var1.readByte();
                    ServerInfo.serverIndex[i] = i;
                }

                var0.close();
                var1.close();
                return;
            }
            writeListServerInfo();
        } catch (Exception var4) {
            readListServerDefault();
        }
    }
    
    public static void readListServerDefault() {
        String[] serverInfo = split(arrServerDefault.trim(), new String(new char[]{','}), 0);
        ServerInfo.listName = new String[serverInfo.length];
        ServerInfo.listIP = new String[serverInfo.length];
        ServerInfo.listPort = new int[serverInfo.length];
        ServerInfo.listTypeArea = new byte[serverInfo.length];
        ServerInfo.serverIndex = new int[serverInfo.length];

        for (int i = 0; i < serverInfo.length; ++i) {
            String[] info = split(serverInfo[i].trim(), new String(new char[]{':'}), 0);
            ServerInfo.listName[i] = info[0];
            ServerInfo.listIP[i] = info[1];
            ServerInfo.listPort[i] = Integer.parseInt(info[2]);
            ServerInfo.listTypeArea[i] = Byte.parseByte(info[3]);
            ServerInfo.serverIndex[i] = i;
        }
        writeListServerInfo();
    }
    
    public static void writeListServerInfo() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        try {
            int n = ServerInfo.listIP.length;
            dataOutputStream.writeInt(n);
            int n2 = 0;
            while (n2 < n) {
                dataOutputStream.writeUTF(ServerInfo.listName[n2]);
                dataOutputStream.writeUTF(ServerInfo.listIP[n2]);
                dataOutputStream.writeInt(ServerInfo.listPort[n2]);
                dataOutputStream.writeByte(ServerInfo.listTypeArea[n2]);
                ++n2;
            }
            dataOutputStream.flush();
            byteArrayOutputStream.flush();
            RMS.writeRecord(new String(new char[]{'a', 'b', 'c', 'd', 'i', 'p'}), byteArrayOutputStream.toByteArray());
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
 }
 