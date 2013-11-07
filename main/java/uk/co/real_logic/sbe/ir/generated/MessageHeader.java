/* Generated SBE (Simple Binary Encoding) message codec */
package uk.co.real_logic.sbe.ir.generated;

import java.nio.ByteOrder;
import java.util.*;
import uk.co.real_logic.sbe.generation.java.*;

public class MessageHeader implements FixedFlyweight
{
    private DirectBuffer buffer;
    private int offset;

    public MessageHeader reset(final DirectBuffer buffer, final int offset)
    {
        this.buffer = buffer;
        this.offset = offset;
        return this;
    }

    public int size()
    {
        return 6;
    }

    public int blockLength()
    {
        return CodecUtil.uint16Get(buffer, offset + 0, ByteOrder.LITTLE_ENDIAN);
    }

    public MessageHeader blockLength(final int value)
    {
        CodecUtil.uint16Put(buffer, offset + 0, value, ByteOrder.LITTLE_ENDIAN);
        return this;
    }

    public int templateId()
    {
        return CodecUtil.uint16Get(buffer, offset + 2, ByteOrder.LITTLE_ENDIAN);
    }

    public MessageHeader templateId(final int value)
    {
        CodecUtil.uint16Put(buffer, offset + 2, value, ByteOrder.LITTLE_ENDIAN);
        return this;
    }

    public short version()
    {
        return CodecUtil.uint8Get(buffer, offset + 4);
    }

    public MessageHeader version(final short value)
    {
        CodecUtil.uint8Put(buffer, offset + 4, value);
        return this;
    }

    public short reserved()
    {
        return CodecUtil.uint8Get(buffer, offset + 5);
    }

    public MessageHeader reserved(final short value)
    {
        CodecUtil.uint8Put(buffer, offset + 5, value);
        return this;
    }
}