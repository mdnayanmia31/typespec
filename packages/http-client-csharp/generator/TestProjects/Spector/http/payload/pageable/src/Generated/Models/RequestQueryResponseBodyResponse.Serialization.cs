// <auto-generated/>

#nullable disable

using System;
using System.ClientModel;
using System.ClientModel.Primitives;
using System.Text.Json;

namespace Payload.Pageable._ServerDrivenPagination.ContinuationToken
{
    public partial class RequestQueryResponseBodyResponse : IJsonModel<RequestQueryResponseBodyResponse>
    {
        void IJsonModel<RequestQueryResponseBodyResponse>.Write(Utf8JsonWriter writer, ModelReaderWriterOptions options) => throw null;

        protected virtual void JsonModelWriteCore(Utf8JsonWriter writer, ModelReaderWriterOptions options) => throw null;

        RequestQueryResponseBodyResponse IJsonModel<RequestQueryResponseBodyResponse>.Create(ref Utf8JsonReader reader, ModelReaderWriterOptions options) => throw null;

        protected virtual RequestQueryResponseBodyResponse JsonModelCreateCore(ref Utf8JsonReader reader, ModelReaderWriterOptions options) => throw null;

        BinaryData IPersistableModel<RequestQueryResponseBodyResponse>.Write(ModelReaderWriterOptions options) => throw null;

        protected virtual BinaryData PersistableModelWriteCore(ModelReaderWriterOptions options) => throw null;

        RequestQueryResponseBodyResponse IPersistableModel<RequestQueryResponseBodyResponse>.Create(BinaryData data, ModelReaderWriterOptions options) => throw null;

        protected virtual RequestQueryResponseBodyResponse PersistableModelCreateCore(BinaryData data, ModelReaderWriterOptions options) => throw null;

        string IPersistableModel<RequestQueryResponseBodyResponse>.GetFormatFromOptions(ModelReaderWriterOptions options) => throw null;

        public static implicit operator BinaryContent(RequestQueryResponseBodyResponse requestQueryResponseBodyResponse) => throw null;

        public static explicit operator RequestQueryResponseBodyResponse(ClientResult result) => throw null;
    }
}
