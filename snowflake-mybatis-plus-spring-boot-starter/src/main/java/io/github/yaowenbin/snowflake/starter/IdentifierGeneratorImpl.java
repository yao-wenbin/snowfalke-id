package io.github.yaowenbin.snowflake.starter;

import com.baomidou.mybatisplus.core.incrementer.IdentifierGenerator;
import com.entropyvalley.snowflake.core.IDGenerator;


public class IdentifierGeneratorImpl implements IdentifierGenerator {

    @Override
    public Number nextId(Object entity) {
        return IDGenerator.generateId();
    }
}
