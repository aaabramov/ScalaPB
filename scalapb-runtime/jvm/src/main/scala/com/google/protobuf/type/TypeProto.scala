// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package com.google.protobuf.`type`



object TypeProto extends _root_.com.trueaccord.scalapb.GeneratedFileObject {
  lazy val dependencies: Seq[_root_.com.trueaccord.scalapb.GeneratedFileObject] = Seq(
    com.google.protobuf.any.AnyProto,
    com.google.protobuf.source_context.SourceContextProto
  )
  lazy val messagesCompanions: Seq[_root_.com.trueaccord.scalapb.GeneratedMessageCompanion[_]] = Seq(
    com.google.protobuf.`type`.Type,
    com.google.protobuf.`type`.Field,
    com.google.protobuf.`type`.Enum,
    com.google.protobuf.`type`.EnumValue,
    com.google.protobuf.`type`.OptionProto
  )
  private lazy val ProtoBytes: Array[Byte] =
      com.trueaccord.scalapb.Encoding.fromBase64(scala.collection.Seq(
  """Chpnb29nbGUvcHJvdG9idWYvdHlwZS5wcm90bxIPZ29vZ2xlLnByb3RvYnVmGhlnb29nbGUvcHJvdG9idWYvYW55LnByb3RvG
  iRnb29nbGUvcHJvdG9idWYvc291cmNlX2NvbnRleHQucHJvdG8ijQIKBFR5cGUSEgoEbmFtZRgBIAEoCVIEbmFtZRIuCgZmaWVsZ
  HMYAiADKAsyFi5nb29nbGUucHJvdG9idWYuRmllbGRSBmZpZWxkcxIWCgZvbmVvZnMYAyADKAlSBm9uZW9mcxIxCgdvcHRpb25zG
  AQgAygLMhcuZ29vZ2xlLnByb3RvYnVmLk9wdGlvblIHb3B0aW9ucxJFCg5zb3VyY2VfY29udGV4dBgFIAEoCzIeLmdvb2dsZS5wc
  m90b2J1Zi5Tb3VyY2VDb250ZXh0Ug1zb3VyY2VDb250ZXh0Ei8KBnN5bnRheBgGIAEoDjIXLmdvb2dsZS5wcm90b2J1Zi5TeW50Y
  XhSBnN5bnRheCK0BgoFRmllbGQSLwoEa2luZBgBIAEoDjIbLmdvb2dsZS5wcm90b2J1Zi5GaWVsZC5LaW5kUgRraW5kEkQKC2Nhc
  mRpbmFsaXR5GAIgASgOMiIuZ29vZ2xlLnByb3RvYnVmLkZpZWxkLkNhcmRpbmFsaXR5UgtjYXJkaW5hbGl0eRIWCgZudW1iZXIYA
  yABKAVSBm51bWJlchISCgRuYW1lGAQgASgJUgRuYW1lEhkKCHR5cGVfdXJsGAYgASgJUgd0eXBlVXJsEh8KC29uZW9mX2luZGV4G
  AcgASgFUgpvbmVvZkluZGV4EhYKBnBhY2tlZBgIIAEoCFIGcGFja2VkEjEKB29wdGlvbnMYCSADKAsyFy5nb29nbGUucHJvdG9id
  WYuT3B0aW9uUgdvcHRpb25zEhsKCWpzb25fbmFtZRgKIAEoCVIIanNvbk5hbWUSIwoNZGVmYXVsdF92YWx1ZRgLIAEoCVIMZGVmY
  XVsdFZhbHVlIsgCCgRLaW5kEhAKDFRZUEVfVU5LTk9XThAAEg8KC1RZUEVfRE9VQkxFEAESDgoKVFlQRV9GTE9BVBACEg4KClRZU
  EVfSU5UNjQQAxIPCgtUWVBFX1VJTlQ2NBAEEg4KClRZUEVfSU5UMzIQBRIQCgxUWVBFX0ZJWEVENjQQBhIQCgxUWVBFX0ZJWEVEM
  zIQBxINCglUWVBFX0JPT0wQCBIPCgtUWVBFX1NUUklORxAJEg4KClRZUEVfR1JPVVAQChIQCgxUWVBFX01FU1NBR0UQCxIOCgpUW
  VBFX0JZVEVTEAwSDwoLVFlQRV9VSU5UMzIQDRINCglUWVBFX0VOVU0QDhIRCg1UWVBFX1NGSVhFRDMyEA8SEQoNVFlQRV9TRklYR
  UQ2NBAQEg8KC1RZUEVfU0lOVDMyEBESDwoLVFlQRV9TSU5UNjQQEiJ0CgtDYXJkaW5hbGl0eRIXChNDQVJESU5BTElUWV9VTktOT
  1dOEAASGAoUQ0FSRElOQUxJVFlfT1BUSU9OQUwQARIYChRDQVJESU5BTElUWV9SRVFVSVJFRBACEhgKFENBUkRJTkFMSVRZX1JFU
  EVBVEVEEAMi/wEKBEVudW0SEgoEbmFtZRgBIAEoCVIEbmFtZRI4CgllbnVtdmFsdWUYAiADKAsyGi5nb29nbGUucHJvdG9idWYuR
  W51bVZhbHVlUgllbnVtdmFsdWUSMQoHb3B0aW9ucxgDIAMoCzIXLmdvb2dsZS5wcm90b2J1Zi5PcHRpb25SB29wdGlvbnMSRQoOc
  291cmNlX2NvbnRleHQYBCABKAsyHi5nb29nbGUucHJvdG9idWYuU291cmNlQ29udGV4dFINc291cmNlQ29udGV4dBIvCgZzeW50Y
  XgYBSABKA4yFy5nb29nbGUucHJvdG9idWYuU3ludGF4UgZzeW50YXgiagoJRW51bVZhbHVlEhIKBG5hbWUYASABKAlSBG5hbWUSF
  goGbnVtYmVyGAIgASgFUgZudW1iZXISMQoHb3B0aW9ucxgDIAMoCzIXLmdvb2dsZS5wcm90b2J1Zi5PcHRpb25SB29wdGlvbnMiS
  AoGT3B0aW9uEhIKBG5hbWUYASABKAlSBG5hbWUSKgoFdmFsdWUYAiABKAsyFC5nb29nbGUucHJvdG9idWYuQW55UgV2YWx1ZSouC
  gZTeW50YXgSEQoNU1lOVEFYX1BST1RPMhAAEhEKDVNZTlRBWF9QUk9UTzMQAUJ9ChNjb20uZ29vZ2xlLnByb3RvYnVmQglUeXBlU
  HJvdG9QAVovZ29vZ2xlLmdvbGFuZy5vcmcvZ2VucHJvdG8vcHJvdG9idWYvcHR5cGU7cHR5cGX4AQGiAgNHUEKqAh5Hb29nbGUuU
  HJvdG9idWYuV2VsbEtub3duVHlwZXNiBnByb3RvMw=="""
      ).mkString)
  lazy val scalaDescriptor: _root_.scalapb.descriptors.FileDescriptor = {
    val scalaProto = com.google.protobuf.descriptor.FileDescriptorProto.parseFrom(ProtoBytes)
    _root_.scalapb.descriptors.FileDescriptor.buildFrom(scalaProto, dependencies.map(_.scalaDescriptor))
  }
  lazy val javaDescriptor: com.google.protobuf.Descriptors.FileDescriptor =
    com.google.protobuf.TypeProto.getDescriptor()
  @deprecated("Use javaDescriptor instead. In a future version this will refer to scalaDescriptor.", "ScalaPB 0.5.47")
  def descriptor: com.google.protobuf.Descriptors.FileDescriptor = javaDescriptor
}