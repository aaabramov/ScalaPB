// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package com.google.protobuf.api



object ApiProto extends _root_.com.trueaccord.scalapb.GeneratedFileObject {
  lazy val dependencies: Seq[_root_.com.trueaccord.scalapb.GeneratedFileObject] = Seq(
    com.google.protobuf.source_context.SourceContextProto,
    com.google.protobuf.`type`.TypeProto
  )
  lazy val messagesCompanions: Seq[_root_.com.trueaccord.scalapb.GeneratedMessageCompanion[_]] = Seq(
    com.google.protobuf.api.Api,
    com.google.protobuf.api.Method,
    com.google.protobuf.api.Mixin
  )
  private lazy val ProtoBytes: Array[Byte] =
      com.trueaccord.scalapb.Encoding.fromBase64(scala.collection.Seq(
  """Chlnb29nbGUvcHJvdG9idWYvYXBpLnByb3RvEg9nb29nbGUucHJvdG9idWYaJGdvb2dsZS9wcm90b2J1Zi9zb3VyY2VfY29ud
  GV4dC5wcm90bxoaZ29vZ2xlL3Byb3RvYnVmL3R5cGUucHJvdG8iwQIKA0FwaRISCgRuYW1lGAEgASgJUgRuYW1lEjEKB21ldGhvZ
  HMYAiADKAsyFy5nb29nbGUucHJvdG9idWYuTWV0aG9kUgdtZXRob2RzEjEKB29wdGlvbnMYAyADKAsyFy5nb29nbGUucHJvdG9id
  WYuT3B0aW9uUgdvcHRpb25zEhgKB3ZlcnNpb24YBCABKAlSB3ZlcnNpb24SRQoOc291cmNlX2NvbnRleHQYBSABKAsyHi5nb29nb
  GUucHJvdG9idWYuU291cmNlQ29udGV4dFINc291cmNlQ29udGV4dBIuCgZtaXhpbnMYBiADKAsyFi5nb29nbGUucHJvdG9idWYuT
  Wl4aW5SBm1peGlucxIvCgZzeW50YXgYByABKA4yFy5nb29nbGUucHJvdG9idWYuU3ludGF4UgZzeW50YXgisgIKBk1ldGhvZBISC
  gRuYW1lGAEgASgJUgRuYW1lEigKEHJlcXVlc3RfdHlwZV91cmwYAiABKAlSDnJlcXVlc3RUeXBlVXJsEisKEXJlcXVlc3Rfc3RyZ
  WFtaW5nGAMgASgIUhByZXF1ZXN0U3RyZWFtaW5nEioKEXJlc3BvbnNlX3R5cGVfdXJsGAQgASgJUg9yZXNwb25zZVR5cGVVcmwSL
  QoScmVzcG9uc2Vfc3RyZWFtaW5nGAUgASgIUhFyZXNwb25zZVN0cmVhbWluZxIxCgdvcHRpb25zGAYgAygLMhcuZ29vZ2xlLnByb
  3RvYnVmLk9wdGlvblIHb3B0aW9ucxIvCgZzeW50YXgYByABKA4yFy5nb29nbGUucHJvdG9idWYuU3ludGF4UgZzeW50YXgiLwoFT
  Wl4aW4SEgoEbmFtZRgBIAEoCVIEbmFtZRISCgRyb290GAIgASgJUgRyb290QnUKE2NvbS5nb29nbGUucHJvdG9idWZCCEFwaVByb
  3RvUAFaK2dvb2dsZS5nb2xhbmcub3JnL2dlbnByb3RvL3Byb3RvYnVmL2FwaTthcGmiAgNHUEKqAh5Hb29nbGUuUHJvdG9idWYuV
  2VsbEtub3duVHlwZXNiBnByb3RvMw=="""
      ).mkString)
  lazy val scalaDescriptor: _root_.scalapb.descriptors.FileDescriptor = {
    val scalaProto = com.google.protobuf.descriptor.FileDescriptorProto.parseFrom(ProtoBytes)
    _root_.scalapb.descriptors.FileDescriptor.buildFrom(scalaProto, dependencies.map(_.scalaDescriptor))
  }
  lazy val javaDescriptor: com.google.protobuf.Descriptors.FileDescriptor = {
    val javaProto = com.google.protobuf.DescriptorProtos.FileDescriptorProto.parseFrom(ProtoBytes)
    com.google.protobuf.Descriptors.FileDescriptor.buildFrom(javaProto, Array(
      com.google.protobuf.source_context.SourceContextProto.javaDescriptor,
      com.google.protobuf.`type`.TypeProto.javaDescriptor
    ))
  }
  @deprecated("Use javaDescriptor instead. In a future version this will refer to scalaDescriptor.", "ScalaPB 0.5.47")
  def descriptor: com.google.protobuf.Descriptors.FileDescriptor = javaDescriptor
}