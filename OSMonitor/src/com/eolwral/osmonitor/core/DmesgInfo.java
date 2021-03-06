// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: dmesgInfo.proto

package com.eolwral.osmonitor.core;

public final class DmesgInfo {
  private DmesgInfo() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface dmesgInfoOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // required .com.eolwral.osmonitor.core.dmesgInfo.dmesgLevel level = 1 [default = INFORMATION];
    boolean hasLevel();
    com.eolwral.osmonitor.core.DmesgInfo.dmesgInfo.dmesgLevel getLevel();
    
    // required uint64 seconds = 2;
    boolean hasSeconds();
    long getSeconds();
    
    // required string message = 3;
    boolean hasMessage();
    String getMessage();
  }
  public static final class dmesgInfo extends
      com.google.protobuf.GeneratedMessage
      implements dmesgInfoOrBuilder {
    // Use dmesgInfo.newBuilder() to construct.
    private dmesgInfo(Builder builder) {
      super(builder);
    }
    private dmesgInfo(boolean noInit) {}
    
    private static final dmesgInfo defaultInstance;
    public static dmesgInfo getDefaultInstance() {
      return defaultInstance;
    }
    
    public dmesgInfo getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.eolwral.osmonitor.core.DmesgInfo.internal_static_com_eolwral_osmonitor_core_dmesgInfo_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.eolwral.osmonitor.core.DmesgInfo.internal_static_com_eolwral_osmonitor_core_dmesgInfo_fieldAccessorTable;
    }
    
    public enum dmesgLevel
        implements com.google.protobuf.ProtocolMessageEnum {
      EMERGENCY(0, 0),
      ALERT(1, 1),
      CRITICAL(2, 2),
      ERROR(3, 3),
      WARNING(4, 4),
      NOTICE(5, 5),
      INFORMATION(6, 6),
      DEBUG(7, 7),
      ;
      
      public static final int EMERGENCY_VALUE = 0;
      public static final int ALERT_VALUE = 1;
      public static final int CRITICAL_VALUE = 2;
      public static final int ERROR_VALUE = 3;
      public static final int WARNING_VALUE = 4;
      public static final int NOTICE_VALUE = 5;
      public static final int INFORMATION_VALUE = 6;
      public static final int DEBUG_VALUE = 7;
      
      
      public final int getNumber() { return value; }
      
      public static dmesgLevel valueOf(int value) {
        switch (value) {
          case 0: return EMERGENCY;
          case 1: return ALERT;
          case 2: return CRITICAL;
          case 3: return ERROR;
          case 4: return WARNING;
          case 5: return NOTICE;
          case 6: return INFORMATION;
          case 7: return DEBUG;
          default: return null;
        }
      }
      
      public static com.google.protobuf.Internal.EnumLiteMap<dmesgLevel>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static com.google.protobuf.Internal.EnumLiteMap<dmesgLevel>
          internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<dmesgLevel>() {
              public dmesgLevel findValueByNumber(int number) {
                return dmesgLevel.valueOf(number);
              }
            };
      
      public final com.google.protobuf.Descriptors.EnumValueDescriptor
          getValueDescriptor() {
        return getDescriptor().getValues().get(index);
      }
      public final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptorForType() {
        return getDescriptor();
      }
      public static final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptor() {
        return com.eolwral.osmonitor.core.DmesgInfo.dmesgInfo.getDescriptor().getEnumTypes().get(0);
      }
      
      private static final dmesgLevel[] VALUES = {
        EMERGENCY, ALERT, CRITICAL, ERROR, WARNING, NOTICE, INFORMATION, DEBUG, 
      };
      
      public static dmesgLevel valueOf(
          com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
        if (desc.getType() != getDescriptor()) {
          throw new java.lang.IllegalArgumentException(
            "EnumValueDescriptor is not for this type.");
        }
        return VALUES[desc.getIndex()];
      }
      
      private final int index;
      private final int value;
      
      private dmesgLevel(int index, int value) {
        this.index = index;
        this.value = value;
      }
      
      // @@protoc_insertion_point(enum_scope:com.eolwral.osmonitor.core.dmesgInfo.dmesgLevel)
    }
    
    private int bitField0_;
    // required .com.eolwral.osmonitor.core.dmesgInfo.dmesgLevel level = 1 [default = INFORMATION];
    public static final int LEVEL_FIELD_NUMBER = 1;
    private com.eolwral.osmonitor.core.DmesgInfo.dmesgInfo.dmesgLevel level_;
    public boolean hasLevel() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    public com.eolwral.osmonitor.core.DmesgInfo.dmesgInfo.dmesgLevel getLevel() {
      return level_;
    }
    
    // required uint64 seconds = 2;
    public static final int SECONDS_FIELD_NUMBER = 2;
    private long seconds_;
    public boolean hasSeconds() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    public long getSeconds() {
      return seconds_;
    }
    
    // required string message = 3;
    public static final int MESSAGE_FIELD_NUMBER = 3;
    private java.lang.Object message_;
    public boolean hasMessage() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    public String getMessage() {
      java.lang.Object ref = message_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (com.google.protobuf.Internal.isValidUtf8(bs)) {
          message_ = s;
        }
        return s;
      }
    }
    private com.google.protobuf.ByteString getMessageBytes() {
      java.lang.Object ref = message_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8((String) ref);
        message_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    
    private void initFields() {
      level_ = com.eolwral.osmonitor.core.DmesgInfo.dmesgInfo.dmesgLevel.INFORMATION;
      seconds_ = 0L;
      message_ = "";
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;
      
      if (!hasLevel()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasSeconds()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasMessage()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }
    
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeEnum(1, level_.getNumber());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeUInt64(2, seconds_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeBytes(3, getMessageBytes());
      }
      getUnknownFields().writeTo(output);
    }
    
    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;
    
      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(1, level_.getNumber());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(2, seconds_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(3, getMessageBytes());
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }
    
    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }
    
    public static com.eolwral.osmonitor.core.DmesgInfo.dmesgInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.eolwral.osmonitor.core.DmesgInfo.dmesgInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.eolwral.osmonitor.core.DmesgInfo.dmesgInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.eolwral.osmonitor.core.DmesgInfo.dmesgInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.eolwral.osmonitor.core.DmesgInfo.dmesgInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.eolwral.osmonitor.core.DmesgInfo.dmesgInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static com.eolwral.osmonitor.core.DmesgInfo.dmesgInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.eolwral.osmonitor.core.DmesgInfo.dmesgInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input, extensionRegistry)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.eolwral.osmonitor.core.DmesgInfo.dmesgInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.eolwral.osmonitor.core.DmesgInfo.dmesgInfo parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.eolwral.osmonitor.core.DmesgInfo.dmesgInfo prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }
    
    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements com.eolwral.osmonitor.core.DmesgInfo.dmesgInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.eolwral.osmonitor.core.DmesgInfo.internal_static_com_eolwral_osmonitor_core_dmesgInfo_descriptor;
      }
      
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.eolwral.osmonitor.core.DmesgInfo.internal_static_com_eolwral_osmonitor_core_dmesgInfo_fieldAccessorTable;
      }
      
      // Construct using com.eolwral.osmonitor.core.DmesgInfo.dmesgInfo.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }
      
      private Builder(BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }
      
      public Builder clear() {
        super.clear();
        level_ = com.eolwral.osmonitor.core.DmesgInfo.dmesgInfo.dmesgLevel.INFORMATION;
        bitField0_ = (bitField0_ & ~0x00000001);
        seconds_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000002);
        message_ = "";
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.eolwral.osmonitor.core.DmesgInfo.dmesgInfo.getDescriptor();
      }
      
      public com.eolwral.osmonitor.core.DmesgInfo.dmesgInfo getDefaultInstanceForType() {
        return com.eolwral.osmonitor.core.DmesgInfo.dmesgInfo.getDefaultInstance();
      }
      
      public com.eolwral.osmonitor.core.DmesgInfo.dmesgInfo build() {
        com.eolwral.osmonitor.core.DmesgInfo.dmesgInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private com.eolwral.osmonitor.core.DmesgInfo.dmesgInfo buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        com.eolwral.osmonitor.core.DmesgInfo.dmesgInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public com.eolwral.osmonitor.core.DmesgInfo.dmesgInfo buildPartial() {
        com.eolwral.osmonitor.core.DmesgInfo.dmesgInfo result = new com.eolwral.osmonitor.core.DmesgInfo.dmesgInfo(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.level_ = level_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.seconds_ = seconds_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.message_ = message_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.eolwral.osmonitor.core.DmesgInfo.dmesgInfo) {
          return mergeFrom((com.eolwral.osmonitor.core.DmesgInfo.dmesgInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(com.eolwral.osmonitor.core.DmesgInfo.dmesgInfo other) {
        if (other == com.eolwral.osmonitor.core.DmesgInfo.dmesgInfo.getDefaultInstance()) return this;
        if (other.hasLevel()) {
          setLevel(other.getLevel());
        }
        if (other.hasSeconds()) {
          setSeconds(other.getSeconds());
        }
        if (other.hasMessage()) {
          setMessage(other.getMessage());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public final boolean isInitialized() {
        if (!hasLevel()) {
          
          return false;
        }
        if (!hasSeconds()) {
          
          return false;
        }
        if (!hasMessage()) {
          
          return false;
        }
        return true;
      }
      
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder(
            this.getUnknownFields());
        while (true) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              this.setUnknownFields(unknownFields.build());
              onChanged();
              return this;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                this.setUnknownFields(unknownFields.build());
                onChanged();
                return this;
              }
              break;
            }
            case 8: {
              int rawValue = input.readEnum();
              com.eolwral.osmonitor.core.DmesgInfo.dmesgInfo.dmesgLevel value = com.eolwral.osmonitor.core.DmesgInfo.dmesgInfo.dmesgLevel.valueOf(rawValue);
              if (value == null) {
                unknownFields.mergeVarintField(1, rawValue);
              } else {
                bitField0_ |= 0x00000001;
                level_ = value;
              }
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              seconds_ = input.readUInt64();
              break;
            }
            case 26: {
              bitField0_ |= 0x00000004;
              message_ = input.readBytes();
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // required .com.eolwral.osmonitor.core.dmesgInfo.dmesgLevel level = 1 [default = INFORMATION];
      private com.eolwral.osmonitor.core.DmesgInfo.dmesgInfo.dmesgLevel level_ = com.eolwral.osmonitor.core.DmesgInfo.dmesgInfo.dmesgLevel.INFORMATION;
      public boolean hasLevel() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      public com.eolwral.osmonitor.core.DmesgInfo.dmesgInfo.dmesgLevel getLevel() {
        return level_;
      }
      public Builder setLevel(com.eolwral.osmonitor.core.DmesgInfo.dmesgInfo.dmesgLevel value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000001;
        level_ = value;
        onChanged();
        return this;
      }
      public Builder clearLevel() {
        bitField0_ = (bitField0_ & ~0x00000001);
        level_ = com.eolwral.osmonitor.core.DmesgInfo.dmesgInfo.dmesgLevel.INFORMATION;
        onChanged();
        return this;
      }
      
      // required uint64 seconds = 2;
      private long seconds_ ;
      public boolean hasSeconds() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      public long getSeconds() {
        return seconds_;
      }
      public Builder setSeconds(long value) {
        bitField0_ |= 0x00000002;
        seconds_ = value;
        onChanged();
        return this;
      }
      public Builder clearSeconds() {
        bitField0_ = (bitField0_ & ~0x00000002);
        seconds_ = 0L;
        onChanged();
        return this;
      }
      
      // required string message = 3;
      private java.lang.Object message_ = "";
      public boolean hasMessage() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      public String getMessage() {
        java.lang.Object ref = message_;
        if (!(ref instanceof String)) {
          String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
          message_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      public Builder setMessage(String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
        message_ = value;
        onChanged();
        return this;
      }
      public Builder clearMessage() {
        bitField0_ = (bitField0_ & ~0x00000004);
        message_ = getDefaultInstance().getMessage();
        onChanged();
        return this;
      }
      void setMessage(com.google.protobuf.ByteString value) {
        bitField0_ |= 0x00000004;
        message_ = value;
        onChanged();
      }
      
      // @@protoc_insertion_point(builder_scope:com.eolwral.osmonitor.core.dmesgInfo)
    }
    
    static {
      defaultInstance = new dmesgInfo(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:com.eolwral.osmonitor.core.dmesgInfo)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_com_eolwral_osmonitor_core_dmesgInfo_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_eolwral_osmonitor_core_dmesgInfo_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\017dmesgInfo.proto\022\032com.eolwral.osmonitor" +
      ".core\"\361\001\n\tdmesgInfo\022L\n\005level\030\001 \002(\01620.com" +
      ".eolwral.osmonitor.core.dmesgInfo.dmesgL" +
      "evel:\013INFORMATION\022\017\n\007seconds\030\002 \002(\004\022\017\n\007me" +
      "ssage\030\003 \002(\t\"t\n\ndmesgLevel\022\r\n\tEMERGENCY\020\000" +
      "\022\t\n\005ALERT\020\001\022\014\n\010CRITICAL\020\002\022\t\n\005ERROR\020\003\022\013\n\007" +
      "WARNING\020\004\022\n\n\006NOTICE\020\005\022\017\n\013INFORMATION\020\006\022\t" +
      "\n\005DEBUG\020\007"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_com_eolwral_osmonitor_core_dmesgInfo_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_com_eolwral_osmonitor_core_dmesgInfo_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_com_eolwral_osmonitor_core_dmesgInfo_descriptor,
              new java.lang.String[] { "Level", "Seconds", "Message", },
              com.eolwral.osmonitor.core.DmesgInfo.dmesgInfo.class,
              com.eolwral.osmonitor.core.DmesgInfo.dmesgInfo.Builder.class);
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
  }
  
  // @@protoc_insertion_point(outer_class_scope)
}
