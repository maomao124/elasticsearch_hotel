package mao.elasticsearch_hotel.service;

import com.baomidou.mybatisplus.extension.service.IService;
import mao.elasticsearch_hotel.entity.Hotel;
import mao.elasticsearch_hotel.entity.PageResult;
import mao.elasticsearch_hotel.entity.RequestParams;

/**
 * Project name(项目名称)：elasticsearch_hotel
 * Package(包名): mao.elasticsearch_hotel.service
 * Class(类名): IHotelService
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/6/2
 * Time(创建时间)： 14:54
 * Version(版本): 1.0
 * Description(描述)： 接口
 */


public interface IHotelService extends IService<Hotel>
{
    /**
     * 搜索
     *
     * @param params 参数
     * @return PageResult
     */
    PageResult search(RequestParams params);
}
