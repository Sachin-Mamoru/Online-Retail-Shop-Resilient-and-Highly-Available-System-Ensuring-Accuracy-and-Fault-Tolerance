// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: InventoryService.proto

package ds.tutorial.inventory.grpc.generated;

public interface SetInventoryRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:ds.tutorial.inventory.grpc.generated.SetInventoryRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string productId = 1;</code>
   * @return The productId.
   */
  java.lang.String getProductId();
  /**
   * <code>string productId = 1;</code>
   * @return The bytes for productId.
   */
  com.google.protobuf.ByteString
      getProductIdBytes();

  /**
   * <code>double value = 2;</code>
   * @return The value.
   */
  double getValue();

  /**
   * <code>bool isSentByPrimary = 3;</code>
   * @return The isSentByPrimary.
   */
  boolean getIsSentByPrimary();
}
