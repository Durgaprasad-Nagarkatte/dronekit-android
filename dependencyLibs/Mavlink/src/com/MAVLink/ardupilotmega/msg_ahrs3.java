/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * java mavlink generator tool. It should not be modified by hand.
 */

// MESSAGE AHRS3 PACKING
package com.MAVLink.ardupilotmega;
import com.MAVLink.MAVLinkPacket;
import com.MAVLink.Messages.MAVLinkMessage;
import com.MAVLink.Messages.MAVLinkPayload;

/**
* Status of third AHRS filter if available. This is for ANU research group (Ali and Sean)
*/
public class msg_ahrs3 extends MAVLinkMessage{

    public static final int MAVLINK_MSG_ID_AHRS3 = 182;
    public static final int MAVLINK_MSG_LENGTH = 40;
    private static final long serialVersionUID = MAVLINK_MSG_ID_AHRS3;


    
    /**
    * Roll angle (rad)
    */
    public float roll;
    
    /**
    * Pitch angle (rad)
    */
    public float pitch;
    
    /**
    * Yaw angle (rad)
    */
    public float yaw;
    
    /**
    * Altitude (MSL)
    */
    public float altitude;
    
    /**
    * Latitude in degrees * 1E7
    */
    public int lat;
    
    /**
    * Longitude in degrees * 1E7
    */
    public int lng;
    
    /**
    * test variable1
    */
    public float v1;
    
    /**
    * test variable2
    */
    public float v2;
    
    /**
    * test variable3
    */
    public float v3;
    
    /**
    * test variable4
    */
    public float v4;
    

    /**
    * Generates the payload for a mavlink message for a message of this type
    * @return
    */
    public MAVLinkPacket pack(){
        MAVLinkPacket packet = new MAVLinkPacket();
        packet.len = MAVLINK_MSG_LENGTH;
        packet.sysid = 255;
        packet.compid = 190;
        packet.msgid = MAVLINK_MSG_ID_AHRS3;
        
        packet.payload.putFloat(roll);
        
        packet.payload.putFloat(pitch);
        
        packet.payload.putFloat(yaw);
        
        packet.payload.putFloat(altitude);
        
        packet.payload.putInt(lat);
        
        packet.payload.putInt(lng);
        
        packet.payload.putFloat(v1);
        
        packet.payload.putFloat(v2);
        
        packet.payload.putFloat(v3);
        
        packet.payload.putFloat(v4);
        
        return packet;
    }

    /**
    * Decode a ahrs3 message into this class fields
    *
    * @param payload The message to decode
    */
    public void unpack(MAVLinkPayload payload) {
        payload.resetIndex();
        
        this.roll = payload.getFloat();
        
        this.pitch = payload.getFloat();
        
        this.yaw = payload.getFloat();
        
        this.altitude = payload.getFloat();
        
        this.lat = payload.getInt();
        
        this.lng = payload.getInt();
        
        this.v1 = payload.getFloat();
        
        this.v2 = payload.getFloat();
        
        this.v3 = payload.getFloat();
        
        this.v4 = payload.getFloat();
        
    }

    /**
    * Constructor for a new message, just initializes the msgid
    */
    public msg_ahrs3(){
        msgid = MAVLINK_MSG_ID_AHRS3;
    }

    /**
    * Constructor for a new message, initializes the message with the payload
    * from a mavlink packet
    *
    */
    public msg_ahrs3(MAVLinkPacket mavLinkPacket){
        this.sysid = mavLinkPacket.sysid;
        this.compid = mavLinkPacket.compid;
        this.msgid = MAVLINK_MSG_ID_AHRS3;
        unpack(mavLinkPacket.payload);
    }

                        
    /**
    * Returns a string with the MSG name and data
    */
    public String toString(){
        return "MAVLINK_MSG_ID_AHRS3 -"+" roll:"+roll+" pitch:"+pitch+" yaw:"+yaw+" altitude:"+altitude+" lat:"+lat+" lng:"+lng+" v1:"+v1+" v2:"+v2+" v3:"+v3+" v4:"+v4+"";
    }
}
        