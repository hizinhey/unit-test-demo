/**
 * Autogenerated by Thrift Compiler (0.14.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.mycompany.mavenproject2.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.14.2)", date = "2021-10-15")
public class CategoryInfo implements org.apache.thrift.TBase<CategoryInfo, CategoryInfo._Fields>, java.io.Serializable, Cloneable, Comparable<CategoryInfo> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("CategoryInfo");

  private static final org.apache.thrift.protocol.TField ID_FIELD_DESC = new org.apache.thrift.protocol.TField("id", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField LIST_STICKER_FIELD_DESC = new org.apache.thrift.protocol.TField("list_sticker", org.apache.thrift.protocol.TType.LIST, (short)2);
  private static final org.apache.thrift.protocol.TField TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("type", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField N_STICKER_FIELD_DESC = new org.apache.thrift.protocol.TField("n_sticker", org.apache.thrift.protocol.TType.I16, (short)4);
  private static final org.apache.thrift.protocol.TField NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("name", org.apache.thrift.protocol.TType.STRING, (short)5);
  private static final org.apache.thrift.protocol.TField DESC_FIELD_DESC = new org.apache.thrift.protocol.TField("desc", org.apache.thrift.protocol.TType.STRING, (short)6);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new CategoryInfoStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new CategoryInfoTupleSchemeFactory();

  public @org.apache.thrift.annotation.Nullable java.lang.String id; // required
  public @org.apache.thrift.annotation.Nullable java.util.List<java.nio.ByteBuffer> list_sticker; // required
  public @org.apache.thrift.annotation.Nullable java.lang.String type; // required
  public short n_sticker; // required
  public @org.apache.thrift.annotation.Nullable java.lang.String name; // required
  public @org.apache.thrift.annotation.Nullable java.lang.String desc; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    ID((short)1, "id"),
    LIST_STICKER((short)2, "list_sticker"),
    TYPE((short)3, "type"),
    N_STICKER((short)4, "n_sticker"),
    NAME((short)5, "name"),
    DESC((short)6, "desc");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // ID
          return ID;
        case 2: // LIST_STICKER
          return LIST_STICKER;
        case 3: // TYPE
          return TYPE;
        case 4: // N_STICKER
          return N_STICKER;
        case 5: // NAME
          return NAME;
        case 6: // DESC
          return DESC;
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
      if (fields == null) throw new java.lang.IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByName(java.lang.String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final java.lang.String _fieldName;

    _Fields(short thriftId, java.lang.String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public java.lang.String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __N_STICKER_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ID, new org.apache.thrift.meta_data.FieldMetaData("id", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.LIST_STICKER, new org.apache.thrift.meta_data.FieldMetaData("list_sticker", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING            , true))));
    tmpMap.put(_Fields.TYPE, new org.apache.thrift.meta_data.FieldMetaData("type", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.N_STICKER, new org.apache.thrift.meta_data.FieldMetaData("n_sticker", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I16)));
    tmpMap.put(_Fields.NAME, new org.apache.thrift.meta_data.FieldMetaData("name", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.DESC, new org.apache.thrift.meta_data.FieldMetaData("desc", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(CategoryInfo.class, metaDataMap);
  }

  public CategoryInfo() {
  }

  public CategoryInfo(
    java.lang.String id,
    java.util.List<java.nio.ByteBuffer> list_sticker,
    java.lang.String type,
    short n_sticker,
    java.lang.String name,
    java.lang.String desc)
  {
    this();
    this.id = id;
    this.list_sticker = list_sticker;
    this.type = type;
    this.n_sticker = n_sticker;
    setN_stickerIsSet(true);
    this.name = name;
    this.desc = desc;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public CategoryInfo(CategoryInfo other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetId()) {
      this.id = other.id;
    }
    if (other.isSetList_sticker()) {
      java.util.List<java.nio.ByteBuffer> __this__list_sticker = new java.util.ArrayList<java.nio.ByteBuffer>(other.list_sticker);
      this.list_sticker = __this__list_sticker;
    }
    if (other.isSetType()) {
      this.type = other.type;
    }
    this.n_sticker = other.n_sticker;
    if (other.isSetName()) {
      this.name = other.name;
    }
    if (other.isSetDesc()) {
      this.desc = other.desc;
    }
  }

  public CategoryInfo deepCopy() {
    return new CategoryInfo(this);
  }

  @Override
  public void clear() {
    this.id = null;
    this.list_sticker = null;
    this.type = null;
    setN_stickerIsSet(false);
    this.n_sticker = 0;
    this.name = null;
    this.desc = null;
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getId() {
    return this.id;
  }

  public CategoryInfo setId(@org.apache.thrift.annotation.Nullable java.lang.String id) {
    this.id = id;
    return this;
  }

  public void unsetId() {
    this.id = null;
  }

  /** Returns true if field id is set (has been assigned a value) and false otherwise */
  public boolean isSetId() {
    return this.id != null;
  }

  public void setIdIsSet(boolean value) {
    if (!value) {
      this.id = null;
    }
  }

  public int getList_stickerSize() {
    return (this.list_sticker == null) ? 0 : this.list_sticker.size();
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Iterator<java.nio.ByteBuffer> getList_stickerIterator() {
    return (this.list_sticker == null) ? null : this.list_sticker.iterator();
  }

  public void addToList_sticker(java.nio.ByteBuffer elem) {
    if (this.list_sticker == null) {
      this.list_sticker = new java.util.ArrayList<java.nio.ByteBuffer>();
    }
    this.list_sticker.add(elem);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.List<java.nio.ByteBuffer> getList_sticker() {
    return this.list_sticker;
  }

  public CategoryInfo setList_sticker(@org.apache.thrift.annotation.Nullable java.util.List<java.nio.ByteBuffer> list_sticker) {
    this.list_sticker = list_sticker;
    return this;
  }

  public void unsetList_sticker() {
    this.list_sticker = null;
  }

  /** Returns true if field list_sticker is set (has been assigned a value) and false otherwise */
  public boolean isSetList_sticker() {
    return this.list_sticker != null;
  }

  public void setList_stickerIsSet(boolean value) {
    if (!value) {
      this.list_sticker = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getType() {
    return this.type;
  }

  public CategoryInfo setType(@org.apache.thrift.annotation.Nullable java.lang.String type) {
    this.type = type;
    return this;
  }

  public void unsetType() {
    this.type = null;
  }

  /** Returns true if field type is set (has been assigned a value) and false otherwise */
  public boolean isSetType() {
    return this.type != null;
  }

  public void setTypeIsSet(boolean value) {
    if (!value) {
      this.type = null;
    }
  }

  public short getN_sticker() {
    return this.n_sticker;
  }

  public CategoryInfo setN_sticker(short n_sticker) {
    this.n_sticker = n_sticker;
    setN_stickerIsSet(true);
    return this;
  }

  public void unsetN_sticker() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __N_STICKER_ISSET_ID);
  }

  /** Returns true if field n_sticker is set (has been assigned a value) and false otherwise */
  public boolean isSetN_sticker() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __N_STICKER_ISSET_ID);
  }

  public void setN_stickerIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __N_STICKER_ISSET_ID, value);
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getName() {
    return this.name;
  }

  public CategoryInfo setName(@org.apache.thrift.annotation.Nullable java.lang.String name) {
    this.name = name;
    return this;
  }

  public void unsetName() {
    this.name = null;
  }

  /** Returns true if field name is set (has been assigned a value) and false otherwise */
  public boolean isSetName() {
    return this.name != null;
  }

  public void setNameIsSet(boolean value) {
    if (!value) {
      this.name = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getDesc() {
    return this.desc;
  }

  public CategoryInfo setDesc(@org.apache.thrift.annotation.Nullable java.lang.String desc) {
    this.desc = desc;
    return this;
  }

  public void unsetDesc() {
    this.desc = null;
  }

  /** Returns true if field desc is set (has been assigned a value) and false otherwise */
  public boolean isSetDesc() {
    return this.desc != null;
  }

  public void setDescIsSet(boolean value) {
    if (!value) {
      this.desc = null;
    }
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case ID:
      if (value == null) {
        unsetId();
      } else {
        setId((java.lang.String)value);
      }
      break;

    case LIST_STICKER:
      if (value == null) {
        unsetList_sticker();
      } else {
        setList_sticker((java.util.List<java.nio.ByteBuffer>)value);
      }
      break;

    case TYPE:
      if (value == null) {
        unsetType();
      } else {
        setType((java.lang.String)value);
      }
      break;

    case N_STICKER:
      if (value == null) {
        unsetN_sticker();
      } else {
        setN_sticker((java.lang.Short)value);
      }
      break;

    case NAME:
      if (value == null) {
        unsetName();
      } else {
        setName((java.lang.String)value);
      }
      break;

    case DESC:
      if (value == null) {
        unsetDesc();
      } else {
        setDesc((java.lang.String)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case ID:
      return getId();

    case LIST_STICKER:
      return getList_sticker();

    case TYPE:
      return getType();

    case N_STICKER:
      return getN_sticker();

    case NAME:
      return getName();

    case DESC:
      return getDesc();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case ID:
      return isSetId();
    case LIST_STICKER:
      return isSetList_sticker();
    case TYPE:
      return isSetType();
    case N_STICKER:
      return isSetN_sticker();
    case NAME:
      return isSetName();
    case DESC:
      return isSetDesc();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof CategoryInfo)
      return this.equals((CategoryInfo)that);
    return false;
  }

  public boolean equals(CategoryInfo that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_id = true && this.isSetId();
    boolean that_present_id = true && that.isSetId();
    if (this_present_id || that_present_id) {
      if (!(this_present_id && that_present_id))
        return false;
      if (!this.id.equals(that.id))
        return false;
    }

    boolean this_present_list_sticker = true && this.isSetList_sticker();
    boolean that_present_list_sticker = true && that.isSetList_sticker();
    if (this_present_list_sticker || that_present_list_sticker) {
      if (!(this_present_list_sticker && that_present_list_sticker))
        return false;
      if (!this.list_sticker.equals(that.list_sticker))
        return false;
    }

    boolean this_present_type = true && this.isSetType();
    boolean that_present_type = true && that.isSetType();
    if (this_present_type || that_present_type) {
      if (!(this_present_type && that_present_type))
        return false;
      if (!this.type.equals(that.type))
        return false;
    }

    boolean this_present_n_sticker = true;
    boolean that_present_n_sticker = true;
    if (this_present_n_sticker || that_present_n_sticker) {
      if (!(this_present_n_sticker && that_present_n_sticker))
        return false;
      if (this.n_sticker != that.n_sticker)
        return false;
    }

    boolean this_present_name = true && this.isSetName();
    boolean that_present_name = true && that.isSetName();
    if (this_present_name || that_present_name) {
      if (!(this_present_name && that_present_name))
        return false;
      if (!this.name.equals(that.name))
        return false;
    }

    boolean this_present_desc = true && this.isSetDesc();
    boolean that_present_desc = true && that.isSetDesc();
    if (this_present_desc || that_present_desc) {
      if (!(this_present_desc && that_present_desc))
        return false;
      if (!this.desc.equals(that.desc))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetId()) ? 131071 : 524287);
    if (isSetId())
      hashCode = hashCode * 8191 + id.hashCode();

    hashCode = hashCode * 8191 + ((isSetList_sticker()) ? 131071 : 524287);
    if (isSetList_sticker())
      hashCode = hashCode * 8191 + list_sticker.hashCode();

    hashCode = hashCode * 8191 + ((isSetType()) ? 131071 : 524287);
    if (isSetType())
      hashCode = hashCode * 8191 + type.hashCode();

    hashCode = hashCode * 8191 + n_sticker;

    hashCode = hashCode * 8191 + ((isSetName()) ? 131071 : 524287);
    if (isSetName())
      hashCode = hashCode * 8191 + name.hashCode();

    hashCode = hashCode * 8191 + ((isSetDesc()) ? 131071 : 524287);
    if (isSetDesc())
      hashCode = hashCode * 8191 + desc.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(CategoryInfo other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetId(), other.isSetId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.id, other.id);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetList_sticker(), other.isSetList_sticker());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetList_sticker()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.list_sticker, other.list_sticker);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetType(), other.isSetType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.type, other.type);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetN_sticker(), other.isSetN_sticker());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetN_sticker()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.n_sticker, other.n_sticker);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetName(), other.isSetName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.name, other.name);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetDesc(), other.isSetDesc());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDesc()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.desc, other.desc);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  @org.apache.thrift.annotation.Nullable
  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    scheme(iprot).read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("CategoryInfo(");
    boolean first = true;

    sb.append("id:");
    if (this.id == null) {
      sb.append("null");
    } else {
      sb.append(this.id);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("list_sticker:");
    if (this.list_sticker == null) {
      sb.append("null");
    } else {
      org.apache.thrift.TBaseHelper.toString(this.list_sticker, sb);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("type:");
    if (this.type == null) {
      sb.append("null");
    } else {
      sb.append(this.type);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("n_sticker:");
    sb.append(this.n_sticker);
    first = false;
    if (!first) sb.append(", ");
    sb.append("name:");
    if (this.name == null) {
      sb.append("null");
    } else {
      sb.append(this.name);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("desc:");
    if (this.desc == null) {
      sb.append("null");
    } else {
      sb.append(this.desc);
    }
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

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class CategoryInfoStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public CategoryInfoStandardScheme getScheme() {
      return new CategoryInfoStandardScheme();
    }
  }

  private static class CategoryInfoStandardScheme extends org.apache.thrift.scheme.StandardScheme<CategoryInfo> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, CategoryInfo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.id = iprot.readString();
              struct.setIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // LIST_STICKER
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list0 = iprot.readListBegin();
                struct.list_sticker = new java.util.ArrayList<java.nio.ByteBuffer>(_list0.size);
                @org.apache.thrift.annotation.Nullable java.nio.ByteBuffer _elem1;
                for (int _i2 = 0; _i2 < _list0.size; ++_i2)
                {
                  _elem1 = iprot.readBinary();
                  struct.list_sticker.add(_elem1);
                }
                iprot.readListEnd();
              }
              struct.setList_stickerIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.type = iprot.readString();
              struct.setTypeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // N_STICKER
            if (schemeField.type == org.apache.thrift.protocol.TType.I16) {
              struct.n_sticker = iprot.readI16();
              struct.setN_stickerIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.name = iprot.readString();
              struct.setNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // DESC
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.desc = iprot.readString();
              struct.setDescIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, CategoryInfo struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.id != null) {
        oprot.writeFieldBegin(ID_FIELD_DESC);
        oprot.writeString(struct.id);
        oprot.writeFieldEnd();
      }
      if (struct.list_sticker != null) {
        oprot.writeFieldBegin(LIST_STICKER_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, struct.list_sticker.size()));
          for (java.nio.ByteBuffer _iter3 : struct.list_sticker)
          {
            oprot.writeBinary(_iter3);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.type != null) {
        oprot.writeFieldBegin(TYPE_FIELD_DESC);
        oprot.writeString(struct.type);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(N_STICKER_FIELD_DESC);
      oprot.writeI16(struct.n_sticker);
      oprot.writeFieldEnd();
      if (struct.name != null) {
        oprot.writeFieldBegin(NAME_FIELD_DESC);
        oprot.writeString(struct.name);
        oprot.writeFieldEnd();
      }
      if (struct.desc != null) {
        oprot.writeFieldBegin(DESC_FIELD_DESC);
        oprot.writeString(struct.desc);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class CategoryInfoTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public CategoryInfoTupleScheme getScheme() {
      return new CategoryInfoTupleScheme();
    }
  }

  private static class CategoryInfoTupleScheme extends org.apache.thrift.scheme.TupleScheme<CategoryInfo> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, CategoryInfo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetId()) {
        optionals.set(0);
      }
      if (struct.isSetList_sticker()) {
        optionals.set(1);
      }
      if (struct.isSetType()) {
        optionals.set(2);
      }
      if (struct.isSetN_sticker()) {
        optionals.set(3);
      }
      if (struct.isSetName()) {
        optionals.set(4);
      }
      if (struct.isSetDesc()) {
        optionals.set(5);
      }
      oprot.writeBitSet(optionals, 6);
      if (struct.isSetId()) {
        oprot.writeString(struct.id);
      }
      if (struct.isSetList_sticker()) {
        {
          oprot.writeI32(struct.list_sticker.size());
          for (java.nio.ByteBuffer _iter4 : struct.list_sticker)
          {
            oprot.writeBinary(_iter4);
          }
        }
      }
      if (struct.isSetType()) {
        oprot.writeString(struct.type);
      }
      if (struct.isSetN_sticker()) {
        oprot.writeI16(struct.n_sticker);
      }
      if (struct.isSetName()) {
        oprot.writeString(struct.name);
      }
      if (struct.isSetDesc()) {
        oprot.writeString(struct.desc);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, CategoryInfo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(6);
      if (incoming.get(0)) {
        struct.id = iprot.readString();
        struct.setIdIsSet(true);
      }
      if (incoming.get(1)) {
        {
          org.apache.thrift.protocol.TList _list5 = iprot.readListBegin(org.apache.thrift.protocol.TType.STRING);
          struct.list_sticker = new java.util.ArrayList<java.nio.ByteBuffer>(_list5.size);
          @org.apache.thrift.annotation.Nullable java.nio.ByteBuffer _elem6;
          for (int _i7 = 0; _i7 < _list5.size; ++_i7)
          {
            _elem6 = iprot.readBinary();
            struct.list_sticker.add(_elem6);
          }
        }
        struct.setList_stickerIsSet(true);
      }
      if (incoming.get(2)) {
        struct.type = iprot.readString();
        struct.setTypeIsSet(true);
      }
      if (incoming.get(3)) {
        struct.n_sticker = iprot.readI16();
        struct.setN_stickerIsSet(true);
      }
      if (incoming.get(4)) {
        struct.name = iprot.readString();
        struct.setNameIsSet(true);
      }
      if (incoming.get(5)) {
        struct.desc = iprot.readString();
        struct.setDescIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

