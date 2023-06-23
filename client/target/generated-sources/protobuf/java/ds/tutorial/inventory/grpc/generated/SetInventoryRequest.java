// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: InventoryService.proto

package ds.tutorial.inventory.grpc.generated;

/**
 * Protobuf type {@code ds.tutorial.inventory.grpc.generated.SetInventoryRequest}
 */
public final class SetInventoryRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:ds.tutorial.inventory.grpc.generated.SetInventoryRequest)
    SetInventoryRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SetInventoryRequest.newBuilder() to construct.
  private SetInventoryRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SetInventoryRequest() {
    productId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SetInventoryRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private SetInventoryRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            productId_ = s;
            break;
          }
          case 17: {

            value_ = input.readDouble();
            break;
          }
          case 24: {

            isSentByPrimary_ = input.readBool();
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return ds.tutorial.inventory.grpc.generated.InventoryService.internal_static_ds_tutorial_inventory_grpc_generated_SetInventoryRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ds.tutorial.inventory.grpc.generated.InventoryService.internal_static_ds_tutorial_inventory_grpc_generated_SetInventoryRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ds.tutorial.inventory.grpc.generated.SetInventoryRequest.class, ds.tutorial.inventory.grpc.generated.SetInventoryRequest.Builder.class);
  }

  public static final int PRODUCTID_FIELD_NUMBER = 1;
  private volatile java.lang.Object productId_;
  /**
   * <code>string productId = 1;</code>
   * @return The productId.
   */
  @java.lang.Override
  public java.lang.String getProductId() {
    java.lang.Object ref = productId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      productId_ = s;
      return s;
    }
  }
  /**
   * <code>string productId = 1;</code>
   * @return The bytes for productId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getProductIdBytes() {
    java.lang.Object ref = productId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      productId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int VALUE_FIELD_NUMBER = 2;
  private double value_;
  /**
   * <code>double value = 2;</code>
   * @return The value.
   */
  @java.lang.Override
  public double getValue() {
    return value_;
  }

  public static final int ISSENTBYPRIMARY_FIELD_NUMBER = 3;
  private boolean isSentByPrimary_;
  /**
   * <code>bool isSentByPrimary = 3;</code>
   * @return The isSentByPrimary.
   */
  @java.lang.Override
  public boolean getIsSentByPrimary() {
    return isSentByPrimary_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getProductIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, productId_);
    }
    if (value_ != 0D) {
      output.writeDouble(2, value_);
    }
    if (isSentByPrimary_ != false) {
      output.writeBool(3, isSentByPrimary_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getProductIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, productId_);
    }
    if (value_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(2, value_);
    }
    if (isSentByPrimary_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(3, isSentByPrimary_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof ds.tutorial.inventory.grpc.generated.SetInventoryRequest)) {
      return super.equals(obj);
    }
    ds.tutorial.inventory.grpc.generated.SetInventoryRequest other = (ds.tutorial.inventory.grpc.generated.SetInventoryRequest) obj;

    if (!getProductId()
        .equals(other.getProductId())) return false;
    if (java.lang.Double.doubleToLongBits(getValue())
        != java.lang.Double.doubleToLongBits(
            other.getValue())) return false;
    if (getIsSentByPrimary()
        != other.getIsSentByPrimary()) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + PRODUCTID_FIELD_NUMBER;
    hash = (53 * hash) + getProductId().hashCode();
    hash = (37 * hash) + VALUE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getValue()));
    hash = (37 * hash) + ISSENTBYPRIMARY_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getIsSentByPrimary());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ds.tutorial.inventory.grpc.generated.SetInventoryRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ds.tutorial.inventory.grpc.generated.SetInventoryRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ds.tutorial.inventory.grpc.generated.SetInventoryRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ds.tutorial.inventory.grpc.generated.SetInventoryRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ds.tutorial.inventory.grpc.generated.SetInventoryRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ds.tutorial.inventory.grpc.generated.SetInventoryRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ds.tutorial.inventory.grpc.generated.SetInventoryRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ds.tutorial.inventory.grpc.generated.SetInventoryRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static ds.tutorial.inventory.grpc.generated.SetInventoryRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static ds.tutorial.inventory.grpc.generated.SetInventoryRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ds.tutorial.inventory.grpc.generated.SetInventoryRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ds.tutorial.inventory.grpc.generated.SetInventoryRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(ds.tutorial.inventory.grpc.generated.SetInventoryRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code ds.tutorial.inventory.grpc.generated.SetInventoryRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ds.tutorial.inventory.grpc.generated.SetInventoryRequest)
      ds.tutorial.inventory.grpc.generated.SetInventoryRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ds.tutorial.inventory.grpc.generated.InventoryService.internal_static_ds_tutorial_inventory_grpc_generated_SetInventoryRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ds.tutorial.inventory.grpc.generated.InventoryService.internal_static_ds_tutorial_inventory_grpc_generated_SetInventoryRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ds.tutorial.inventory.grpc.generated.SetInventoryRequest.class, ds.tutorial.inventory.grpc.generated.SetInventoryRequest.Builder.class);
    }

    // Construct using ds.tutorial.inventory.grpc.generated.SetInventoryRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      productId_ = "";

      value_ = 0D;

      isSentByPrimary_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ds.tutorial.inventory.grpc.generated.InventoryService.internal_static_ds_tutorial_inventory_grpc_generated_SetInventoryRequest_descriptor;
    }

    @java.lang.Override
    public ds.tutorial.inventory.grpc.generated.SetInventoryRequest getDefaultInstanceForType() {
      return ds.tutorial.inventory.grpc.generated.SetInventoryRequest.getDefaultInstance();
    }

    @java.lang.Override
    public ds.tutorial.inventory.grpc.generated.SetInventoryRequest build() {
      ds.tutorial.inventory.grpc.generated.SetInventoryRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public ds.tutorial.inventory.grpc.generated.SetInventoryRequest buildPartial() {
      ds.tutorial.inventory.grpc.generated.SetInventoryRequest result = new ds.tutorial.inventory.grpc.generated.SetInventoryRequest(this);
      result.productId_ = productId_;
      result.value_ = value_;
      result.isSentByPrimary_ = isSentByPrimary_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof ds.tutorial.inventory.grpc.generated.SetInventoryRequest) {
        return mergeFrom((ds.tutorial.inventory.grpc.generated.SetInventoryRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ds.tutorial.inventory.grpc.generated.SetInventoryRequest other) {
      if (other == ds.tutorial.inventory.grpc.generated.SetInventoryRequest.getDefaultInstance()) return this;
      if (!other.getProductId().isEmpty()) {
        productId_ = other.productId_;
        onChanged();
      }
      if (other.getValue() != 0D) {
        setValue(other.getValue());
      }
      if (other.getIsSentByPrimary() != false) {
        setIsSentByPrimary(other.getIsSentByPrimary());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      ds.tutorial.inventory.grpc.generated.SetInventoryRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (ds.tutorial.inventory.grpc.generated.SetInventoryRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object productId_ = "";
    /**
     * <code>string productId = 1;</code>
     * @return The productId.
     */
    public java.lang.String getProductId() {
      java.lang.Object ref = productId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        productId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string productId = 1;</code>
     * @return The bytes for productId.
     */
    public com.google.protobuf.ByteString
        getProductIdBytes() {
      java.lang.Object ref = productId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        productId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string productId = 1;</code>
     * @param value The productId to set.
     * @return This builder for chaining.
     */
    public Builder setProductId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      productId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string productId = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearProductId() {
      
      productId_ = getDefaultInstance().getProductId();
      onChanged();
      return this;
    }
    /**
     * <code>string productId = 1;</code>
     * @param value The bytes for productId to set.
     * @return This builder for chaining.
     */
    public Builder setProductIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      productId_ = value;
      onChanged();
      return this;
    }

    private double value_ ;
    /**
     * <code>double value = 2;</code>
     * @return The value.
     */
    @java.lang.Override
    public double getValue() {
      return value_;
    }
    /**
     * <code>double value = 2;</code>
     * @param value The value to set.
     * @return This builder for chaining.
     */
    public Builder setValue(double value) {
      
      value_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double value = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearValue() {
      
      value_ = 0D;
      onChanged();
      return this;
    }

    private boolean isSentByPrimary_ ;
    /**
     * <code>bool isSentByPrimary = 3;</code>
     * @return The isSentByPrimary.
     */
    @java.lang.Override
    public boolean getIsSentByPrimary() {
      return isSentByPrimary_;
    }
    /**
     * <code>bool isSentByPrimary = 3;</code>
     * @param value The isSentByPrimary to set.
     * @return This builder for chaining.
     */
    public Builder setIsSentByPrimary(boolean value) {
      
      isSentByPrimary_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool isSentByPrimary = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearIsSentByPrimary() {
      
      isSentByPrimary_ = false;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:ds.tutorial.inventory.grpc.generated.SetInventoryRequest)
  }

  // @@protoc_insertion_point(class_scope:ds.tutorial.inventory.grpc.generated.SetInventoryRequest)
  private static final ds.tutorial.inventory.grpc.generated.SetInventoryRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ds.tutorial.inventory.grpc.generated.SetInventoryRequest();
  }

  public static ds.tutorial.inventory.grpc.generated.SetInventoryRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SetInventoryRequest>
      PARSER = new com.google.protobuf.AbstractParser<SetInventoryRequest>() {
    @java.lang.Override
    public SetInventoryRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new SetInventoryRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SetInventoryRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SetInventoryRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public ds.tutorial.inventory.grpc.generated.SetInventoryRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
