/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package alluxio.thrift;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)")
public class MasterInfo implements org.apache.thrift.TBase<MasterInfo, MasterInfo._Fields>, java.io.Serializable, Cloneable, Comparable<MasterInfo> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("MasterInfo");

  private static final org.apache.thrift.protocol.TField MASTER_ADDRESS_FIELD_DESC = new org.apache.thrift.protocol.TField("masterAddress", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField RPC_PORT_FIELD_DESC = new org.apache.thrift.protocol.TField("rpcPort", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField SAFE_MODE_FIELD_DESC = new org.apache.thrift.protocol.TField("safeMode", org.apache.thrift.protocol.TType.BOOL, (short)3);
  private static final org.apache.thrift.protocol.TField START_TIME_MS_FIELD_DESC = new org.apache.thrift.protocol.TField("startTimeMs", org.apache.thrift.protocol.TType.I64, (short)4);
  private static final org.apache.thrift.protocol.TField UP_TIME_MS_FIELD_DESC = new org.apache.thrift.protocol.TField("upTimeMs", org.apache.thrift.protocol.TType.I64, (short)5);
  private static final org.apache.thrift.protocol.TField VERSION_FIELD_DESC = new org.apache.thrift.protocol.TField("version", org.apache.thrift.protocol.TType.STRING, (short)6);
  private static final org.apache.thrift.protocol.TField WEB_PORT_FIELD_DESC = new org.apache.thrift.protocol.TField("webPort", org.apache.thrift.protocol.TType.I32, (short)7);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new MasterInfoStandardSchemeFactory());
    schemes.put(TupleScheme.class, new MasterInfoTupleSchemeFactory());
  }

  private String masterAddress; // required
  private int rpcPort; // required
  private boolean safeMode; // required
  private long startTimeMs; // required
  private long upTimeMs; // required
  private String version; // required
  private int webPort; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    MASTER_ADDRESS((short)1, "masterAddress"),
    RPC_PORT((short)2, "rpcPort"),
    SAFE_MODE((short)3, "safeMode"),
    START_TIME_MS((short)4, "startTimeMs"),
    UP_TIME_MS((short)5, "upTimeMs"),
    VERSION((short)6, "version"),
    WEB_PORT((short)7, "webPort");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // MASTER_ADDRESS
          return MASTER_ADDRESS;
        case 2: // RPC_PORT
          return RPC_PORT;
        case 3: // SAFE_MODE
          return SAFE_MODE;
        case 4: // START_TIME_MS
          return START_TIME_MS;
        case 5: // UP_TIME_MS
          return UP_TIME_MS;
        case 6: // VERSION
          return VERSION;
        case 7: // WEB_PORT
          return WEB_PORT;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __RPCPORT_ISSET_ID = 0;
  private static final int __SAFEMODE_ISSET_ID = 1;
  private static final int __STARTTIMEMS_ISSET_ID = 2;
  private static final int __UPTIMEMS_ISSET_ID = 3;
  private static final int __WEBPORT_ISSET_ID = 4;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.MASTER_ADDRESS, new org.apache.thrift.meta_data.FieldMetaData("masterAddress", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.RPC_PORT, new org.apache.thrift.meta_data.FieldMetaData("rpcPort", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.SAFE_MODE, new org.apache.thrift.meta_data.FieldMetaData("safeMode", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.START_TIME_MS, new org.apache.thrift.meta_data.FieldMetaData("startTimeMs", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.UP_TIME_MS, new org.apache.thrift.meta_data.FieldMetaData("upTimeMs", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.VERSION, new org.apache.thrift.meta_data.FieldMetaData("version", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.WEB_PORT, new org.apache.thrift.meta_data.FieldMetaData("webPort", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(MasterInfo.class, metaDataMap);
  }

  public MasterInfo() {
  }

  public MasterInfo(
    String masterAddress,
    int rpcPort,
    boolean safeMode,
    long startTimeMs,
    long upTimeMs,
    String version,
    int webPort)
  {
    this();
    this.masterAddress = masterAddress;
    this.rpcPort = rpcPort;
    setRpcPortIsSet(true);
    this.safeMode = safeMode;
    setSafeModeIsSet(true);
    this.startTimeMs = startTimeMs;
    setStartTimeMsIsSet(true);
    this.upTimeMs = upTimeMs;
    setUpTimeMsIsSet(true);
    this.version = version;
    this.webPort = webPort;
    setWebPortIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public MasterInfo(MasterInfo other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetMasterAddress()) {
      this.masterAddress = other.masterAddress;
    }
    this.rpcPort = other.rpcPort;
    this.safeMode = other.safeMode;
    this.startTimeMs = other.startTimeMs;
    this.upTimeMs = other.upTimeMs;
    if (other.isSetVersion()) {
      this.version = other.version;
    }
    this.webPort = other.webPort;
  }

  public MasterInfo deepCopy() {
    return new MasterInfo(this);
  }

  @Override
  public void clear() {
    this.masterAddress = null;
    setRpcPortIsSet(false);
    this.rpcPort = 0;
    setSafeModeIsSet(false);
    this.safeMode = false;
    setStartTimeMsIsSet(false);
    this.startTimeMs = 0;
    setUpTimeMsIsSet(false);
    this.upTimeMs = 0;
    this.version = null;
    setWebPortIsSet(false);
    this.webPort = 0;
  }

  public String getMasterAddress() {
    return this.masterAddress;
  }

  public MasterInfo setMasterAddress(String masterAddress) {
    this.masterAddress = masterAddress;
    return this;
  }

  public void unsetMasterAddress() {
    this.masterAddress = null;
  }

  /** Returns true if field masterAddress is set (has been assigned a value) and false otherwise */
  public boolean isSetMasterAddress() {
    return this.masterAddress != null;
  }

  public void setMasterAddressIsSet(boolean value) {
    if (!value) {
      this.masterAddress = null;
    }
  }

  public int getRpcPort() {
    return this.rpcPort;
  }

  public MasterInfo setRpcPort(int rpcPort) {
    this.rpcPort = rpcPort;
    setRpcPortIsSet(true);
    return this;
  }

  public void unsetRpcPort() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __RPCPORT_ISSET_ID);
  }

  /** Returns true if field rpcPort is set (has been assigned a value) and false otherwise */
  public boolean isSetRpcPort() {
    return EncodingUtils.testBit(__isset_bitfield, __RPCPORT_ISSET_ID);
  }

  public void setRpcPortIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __RPCPORT_ISSET_ID, value);
  }

  public boolean isSafeMode() {
    return this.safeMode;
  }

  public MasterInfo setSafeMode(boolean safeMode) {
    this.safeMode = safeMode;
    setSafeModeIsSet(true);
    return this;
  }

  public void unsetSafeMode() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __SAFEMODE_ISSET_ID);
  }

  /** Returns true if field safeMode is set (has been assigned a value) and false otherwise */
  public boolean isSetSafeMode() {
    return EncodingUtils.testBit(__isset_bitfield, __SAFEMODE_ISSET_ID);
  }

  public void setSafeModeIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __SAFEMODE_ISSET_ID, value);
  }

  public long getStartTimeMs() {
    return this.startTimeMs;
  }

  public MasterInfo setStartTimeMs(long startTimeMs) {
    this.startTimeMs = startTimeMs;
    setStartTimeMsIsSet(true);
    return this;
  }

  public void unsetStartTimeMs() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __STARTTIMEMS_ISSET_ID);
  }

  /** Returns true if field startTimeMs is set (has been assigned a value) and false otherwise */
  public boolean isSetStartTimeMs() {
    return EncodingUtils.testBit(__isset_bitfield, __STARTTIMEMS_ISSET_ID);
  }

  public void setStartTimeMsIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __STARTTIMEMS_ISSET_ID, value);
  }

  public long getUpTimeMs() {
    return this.upTimeMs;
  }

  public MasterInfo setUpTimeMs(long upTimeMs) {
    this.upTimeMs = upTimeMs;
    setUpTimeMsIsSet(true);
    return this;
  }

  public void unsetUpTimeMs() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __UPTIMEMS_ISSET_ID);
  }

  /** Returns true if field upTimeMs is set (has been assigned a value) and false otherwise */
  public boolean isSetUpTimeMs() {
    return EncodingUtils.testBit(__isset_bitfield, __UPTIMEMS_ISSET_ID);
  }

  public void setUpTimeMsIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __UPTIMEMS_ISSET_ID, value);
  }

  public String getVersion() {
    return this.version;
  }

  public MasterInfo setVersion(String version) {
    this.version = version;
    return this;
  }

  public void unsetVersion() {
    this.version = null;
  }

  /** Returns true if field version is set (has been assigned a value) and false otherwise */
  public boolean isSetVersion() {
    return this.version != null;
  }

  public void setVersionIsSet(boolean value) {
    if (!value) {
      this.version = null;
    }
  }

  public int getWebPort() {
    return this.webPort;
  }

  public MasterInfo setWebPort(int webPort) {
    this.webPort = webPort;
    setWebPortIsSet(true);
    return this;
  }

  public void unsetWebPort() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __WEBPORT_ISSET_ID);
  }

  /** Returns true if field webPort is set (has been assigned a value) and false otherwise */
  public boolean isSetWebPort() {
    return EncodingUtils.testBit(__isset_bitfield, __WEBPORT_ISSET_ID);
  }

  public void setWebPortIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __WEBPORT_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case MASTER_ADDRESS:
      if (value == null) {
        unsetMasterAddress();
      } else {
        setMasterAddress((String)value);
      }
      break;

    case RPC_PORT:
      if (value == null) {
        unsetRpcPort();
      } else {
        setRpcPort((Integer)value);
      }
      break;

    case SAFE_MODE:
      if (value == null) {
        unsetSafeMode();
      } else {
        setSafeMode((Boolean)value);
      }
      break;

    case START_TIME_MS:
      if (value == null) {
        unsetStartTimeMs();
      } else {
        setStartTimeMs((Long)value);
      }
      break;

    case UP_TIME_MS:
      if (value == null) {
        unsetUpTimeMs();
      } else {
        setUpTimeMs((Long)value);
      }
      break;

    case VERSION:
      if (value == null) {
        unsetVersion();
      } else {
        setVersion((String)value);
      }
      break;

    case WEB_PORT:
      if (value == null) {
        unsetWebPort();
      } else {
        setWebPort((Integer)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case MASTER_ADDRESS:
      return getMasterAddress();

    case RPC_PORT:
      return getRpcPort();

    case SAFE_MODE:
      return isSafeMode();

    case START_TIME_MS:
      return getStartTimeMs();

    case UP_TIME_MS:
      return getUpTimeMs();

    case VERSION:
      return getVersion();

    case WEB_PORT:
      return getWebPort();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case MASTER_ADDRESS:
      return isSetMasterAddress();
    case RPC_PORT:
      return isSetRpcPort();
    case SAFE_MODE:
      return isSetSafeMode();
    case START_TIME_MS:
      return isSetStartTimeMs();
    case UP_TIME_MS:
      return isSetUpTimeMs();
    case VERSION:
      return isSetVersion();
    case WEB_PORT:
      return isSetWebPort();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof MasterInfo)
      return this.equals((MasterInfo)that);
    return false;
  }

  public boolean equals(MasterInfo that) {
    if (that == null)
      return false;

    boolean this_present_masterAddress = true && this.isSetMasterAddress();
    boolean that_present_masterAddress = true && that.isSetMasterAddress();
    if (this_present_masterAddress || that_present_masterAddress) {
      if (!(this_present_masterAddress && that_present_masterAddress))
        return false;
      if (!this.masterAddress.equals(that.masterAddress))
        return false;
    }

    boolean this_present_rpcPort = true;
    boolean that_present_rpcPort = true;
    if (this_present_rpcPort || that_present_rpcPort) {
      if (!(this_present_rpcPort && that_present_rpcPort))
        return false;
      if (this.rpcPort != that.rpcPort)
        return false;
    }

    boolean this_present_safeMode = true;
    boolean that_present_safeMode = true;
    if (this_present_safeMode || that_present_safeMode) {
      if (!(this_present_safeMode && that_present_safeMode))
        return false;
      if (this.safeMode != that.safeMode)
        return false;
    }

    boolean this_present_startTimeMs = true;
    boolean that_present_startTimeMs = true;
    if (this_present_startTimeMs || that_present_startTimeMs) {
      if (!(this_present_startTimeMs && that_present_startTimeMs))
        return false;
      if (this.startTimeMs != that.startTimeMs)
        return false;
    }

    boolean this_present_upTimeMs = true;
    boolean that_present_upTimeMs = true;
    if (this_present_upTimeMs || that_present_upTimeMs) {
      if (!(this_present_upTimeMs && that_present_upTimeMs))
        return false;
      if (this.upTimeMs != that.upTimeMs)
        return false;
    }

    boolean this_present_version = true && this.isSetVersion();
    boolean that_present_version = true && that.isSetVersion();
    if (this_present_version || that_present_version) {
      if (!(this_present_version && that_present_version))
        return false;
      if (!this.version.equals(that.version))
        return false;
    }

    boolean this_present_webPort = true;
    boolean that_present_webPort = true;
    if (this_present_webPort || that_present_webPort) {
      if (!(this_present_webPort && that_present_webPort))
        return false;
      if (this.webPort != that.webPort)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_masterAddress = true && (isSetMasterAddress());
    list.add(present_masterAddress);
    if (present_masterAddress)
      list.add(masterAddress);

    boolean present_rpcPort = true;
    list.add(present_rpcPort);
    if (present_rpcPort)
      list.add(rpcPort);

    boolean present_safeMode = true;
    list.add(present_safeMode);
    if (present_safeMode)
      list.add(safeMode);

    boolean present_startTimeMs = true;
    list.add(present_startTimeMs);
    if (present_startTimeMs)
      list.add(startTimeMs);

    boolean present_upTimeMs = true;
    list.add(present_upTimeMs);
    if (present_upTimeMs)
      list.add(upTimeMs);

    boolean present_version = true && (isSetVersion());
    list.add(present_version);
    if (present_version)
      list.add(version);

    boolean present_webPort = true;
    list.add(present_webPort);
    if (present_webPort)
      list.add(webPort);

    return list.hashCode();
  }

  @Override
  public int compareTo(MasterInfo other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetMasterAddress()).compareTo(other.isSetMasterAddress());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMasterAddress()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.masterAddress, other.masterAddress);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetRpcPort()).compareTo(other.isSetRpcPort());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRpcPort()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.rpcPort, other.rpcPort);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetSafeMode()).compareTo(other.isSetSafeMode());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSafeMode()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.safeMode, other.safeMode);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetStartTimeMs()).compareTo(other.isSetStartTimeMs());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStartTimeMs()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.startTimeMs, other.startTimeMs);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetUpTimeMs()).compareTo(other.isSetUpTimeMs());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUpTimeMs()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.upTimeMs, other.upTimeMs);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetVersion()).compareTo(other.isSetVersion());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetVersion()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.version, other.version);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetWebPort()).compareTo(other.isSetWebPort());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetWebPort()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.webPort, other.webPort);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("MasterInfo(");
    boolean first = true;

    sb.append("masterAddress:");
    if (this.masterAddress == null) {
      sb.append("null");
    } else {
      sb.append(this.masterAddress);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("rpcPort:");
    sb.append(this.rpcPort);
    first = false;
    if (!first) sb.append(", ");
    sb.append("safeMode:");
    sb.append(this.safeMode);
    first = false;
    if (!first) sb.append(", ");
    sb.append("startTimeMs:");
    sb.append(this.startTimeMs);
    first = false;
    if (!first) sb.append(", ");
    sb.append("upTimeMs:");
    sb.append(this.upTimeMs);
    first = false;
    if (!first) sb.append(", ");
    sb.append("version:");
    if (this.version == null) {
      sb.append("null");
    } else {
      sb.append(this.version);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("webPort:");
    sb.append(this.webPort);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class MasterInfoStandardSchemeFactory implements SchemeFactory {
    public MasterInfoStandardScheme getScheme() {
      return new MasterInfoStandardScheme();
    }
  }

  private static class MasterInfoStandardScheme extends StandardScheme<MasterInfo> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, MasterInfo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // MASTER_ADDRESS
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.masterAddress = iprot.readString();
              struct.setMasterAddressIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // RPC_PORT
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.rpcPort = iprot.readI32();
              struct.setRpcPortIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // SAFE_MODE
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.safeMode = iprot.readBool();
              struct.setSafeModeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // START_TIME_MS
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.startTimeMs = iprot.readI64();
              struct.setStartTimeMsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // UP_TIME_MS
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.upTimeMs = iprot.readI64();
              struct.setUpTimeMsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // VERSION
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.version = iprot.readString();
              struct.setVersionIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 7: // WEB_PORT
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.webPort = iprot.readI32();
              struct.setWebPortIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, MasterInfo struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.masterAddress != null) {
        oprot.writeFieldBegin(MASTER_ADDRESS_FIELD_DESC);
        oprot.writeString(struct.masterAddress);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(RPC_PORT_FIELD_DESC);
      oprot.writeI32(struct.rpcPort);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(SAFE_MODE_FIELD_DESC);
      oprot.writeBool(struct.safeMode);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(START_TIME_MS_FIELD_DESC);
      oprot.writeI64(struct.startTimeMs);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(UP_TIME_MS_FIELD_DESC);
      oprot.writeI64(struct.upTimeMs);
      oprot.writeFieldEnd();
      if (struct.version != null) {
        oprot.writeFieldBegin(VERSION_FIELD_DESC);
        oprot.writeString(struct.version);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(WEB_PORT_FIELD_DESC);
      oprot.writeI32(struct.webPort);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class MasterInfoTupleSchemeFactory implements SchemeFactory {
    public MasterInfoTupleScheme getScheme() {
      return new MasterInfoTupleScheme();
    }
  }

  private static class MasterInfoTupleScheme extends TupleScheme<MasterInfo> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, MasterInfo struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetMasterAddress()) {
        optionals.set(0);
      }
      if (struct.isSetRpcPort()) {
        optionals.set(1);
      }
      if (struct.isSetSafeMode()) {
        optionals.set(2);
      }
      if (struct.isSetStartTimeMs()) {
        optionals.set(3);
      }
      if (struct.isSetUpTimeMs()) {
        optionals.set(4);
      }
      if (struct.isSetVersion()) {
        optionals.set(5);
      }
      if (struct.isSetWebPort()) {
        optionals.set(6);
      }
      oprot.writeBitSet(optionals, 7);
      if (struct.isSetMasterAddress()) {
        oprot.writeString(struct.masterAddress);
      }
      if (struct.isSetRpcPort()) {
        oprot.writeI32(struct.rpcPort);
      }
      if (struct.isSetSafeMode()) {
        oprot.writeBool(struct.safeMode);
      }
      if (struct.isSetStartTimeMs()) {
        oprot.writeI64(struct.startTimeMs);
      }
      if (struct.isSetUpTimeMs()) {
        oprot.writeI64(struct.upTimeMs);
      }
      if (struct.isSetVersion()) {
        oprot.writeString(struct.version);
      }
      if (struct.isSetWebPort()) {
        oprot.writeI32(struct.webPort);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, MasterInfo struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(7);
      if (incoming.get(0)) {
        struct.masterAddress = iprot.readString();
        struct.setMasterAddressIsSet(true);
      }
      if (incoming.get(1)) {
        struct.rpcPort = iprot.readI32();
        struct.setRpcPortIsSet(true);
      }
      if (incoming.get(2)) {
        struct.safeMode = iprot.readBool();
        struct.setSafeModeIsSet(true);
      }
      if (incoming.get(3)) {
        struct.startTimeMs = iprot.readI64();
        struct.setStartTimeMsIsSet(true);
      }
      if (incoming.get(4)) {
        struct.upTimeMs = iprot.readI64();
        struct.setUpTimeMsIsSet(true);
      }
      if (incoming.get(5)) {
        struct.version = iprot.readString();
        struct.setVersionIsSet(true);
      }
      if (incoming.get(6)) {
        struct.webPort = iprot.readI32();
        struct.setWebPortIsSet(true);
      }
    }
  }

}

