package pri.growup.base.converter;

import pri.growup.base.domain.BaseDM;
import pri.growup.base.persistence.BaseDto;

/**
 * The Class BaseConverter
 * domain和dto转换的基本类
 *
 * @author PLF
 * @param <M> dto
 * @param <T> domain
 */
public abstract class BaseConverter<T extends BaseDM, M extends BaseDto> {
    /**
     * 将domain的值赋值给dto
     *
     * @param domain domain
     * @param dto    dto
     */
    public abstract void convertDomainToDto(T domain, M dto);

    /**
     * 将dto的值赋值给domain
     *
     * @param domain domain
     * @param dto    dto
     */
    public abstract void convertDtoToDomain(T domain, M dto);
}
