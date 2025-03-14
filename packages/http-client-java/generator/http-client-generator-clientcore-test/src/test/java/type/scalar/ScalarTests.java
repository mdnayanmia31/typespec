// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package type.scalar;

import io.clientcore.core.models.binarydata.BinaryData;
import java.io.IOException;
import java.math.BigDecimal;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class ScalarTests {

    private final StringOperationClient stringClient = new ScalarClientBuilder().buildStringOperationClient();
    private final BooleanOperationClient booleanClient = new ScalarClientBuilder().buildBooleanOperationClient();
    private final UnknownClient unknownClient = new ScalarClientBuilder().buildUnknownClient();

    private final DecimalTypeClient decimalClient1 = new ScalarClientBuilder().buildDecimalTypeClient();
    private final Decimal128TypeClient decimalClient2 = new ScalarClientBuilder().buildDecimal128TypeClient();
    private final DecimalVerifyClient decimalClient3 = new ScalarClientBuilder().buildDecimalVerifyClient();
    private final Decimal128VerifyClient decimalClient4 = new ScalarClientBuilder().buildDecimal128VerifyClient();

    @Test
    public void test() throws IOException {
        Assertions.assertEquals("test", stringClient.get());
        stringClient.put("test");

        Assertions.assertTrue(booleanClient.get());
        booleanClient.put(true);

        Assertions.assertEquals("test", unknownClient.get().toObject(String.class));
        unknownClient.put(BinaryData.fromObject("test"));
    }

    @Test
    @Disabled("Body provided doesn't match expected body\",\"expected\":0.33333,\"actual\":\"0.33333\"")
    public void testDecimal() {
        BigDecimal decimal = new BigDecimal("0.33333");

        decimalClient1.requestBody(decimal);
        decimalClient1.requestParameter(decimal);
        Assertions.assertEquals(decimal, decimalClient1.responseBody());

        decimalClient2.requestBody(decimal);
        decimalClient2.requestParameter(decimal);
        Assertions.assertEquals(decimal, decimalClient2.responseBody());

        decimalClient3.verify(decimalClient3.prepareVerify().stream().reduce(BigDecimal.valueOf(0), BigDecimal::add));

        decimalClient4.verify(decimalClient4.prepareVerify().stream().reduce(BigDecimal.valueOf(0), BigDecimal::add));
    }
}
