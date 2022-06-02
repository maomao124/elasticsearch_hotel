package mao.elasticsearch_hotel.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import mao.elasticsearch_hotel.entity.Hotel;
import org.apache.ibatis.annotations.Mapper;

/**
 * Project name(项目名称)：elasticsearch_hotel
 * Package(包名): mao.elasticsearch_hotel.mapper
 * Interface(接口名): HotelMapper
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/6/2
 * Time(创建时间)： 15:09
 * Version(版本): 1.0
 * Description(描述)： HotelMapper
 */

@Mapper
public interface HotelMapper extends BaseMapper<Hotel>
{

}
