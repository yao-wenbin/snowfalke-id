package com.entropyvalley.snowflake.autoconfiguration;

import com.baomidou.mybatisplus.core.incrementer.IdentifierGenerator;
import com.entropyvalley.snowflake.core.IDGenerator;


public class IdentifierGeneratorImpl implements IdentifierGenerator {

    @Override
    public Number nextId(Object entity) {
        return IDGenerator.generateId();
    }
}
