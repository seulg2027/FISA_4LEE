"use client";

import {
  Button,
  Flex,
  Select,
  Table,
  Text,
  TextInput,
  Container,
} from "@mantine/core";
import { DatePicker, DatePickerInput } from "@mantine/dates";
import React, { useState } from "react";
import axios from "axios";
import { format } from 'date-fns';

const ViewPage = () => { 
    const [dateVal, setDateVal] = useState<Date | null>(null);
    const [IndustryVal, setIndustryVal] = useState<string | null>(null);
    const [amountVal, setAmountVal] = useState<string>("");
    const [usageVal, setUsageVal] = useState<string>("");
    const [timelineVal, setTimeLineVal] = useState<string>("");
    const [idVal, setIdVal] = useState<number>(null);
    const [queryVal, setQueryVal] = useState<string | null>(null);
    const [currentTime, setCurrentTime] = useState<string>(() => {
        const now = new Date();
        return now.toISOString().replace('T', ' ').slice(0, 23);
      });

  // 테이블 데이터 상태
  const [tableData, setTableData] = useState<{
    head: string[];
    body: any[][];
  }>({
    head: [
      "Industry",
      "Transaction Date",
      "Time",
      "Total Amount",
      "Usage Count",
    ],
    body: [],
  });


  // Industry 값 변경 핸들러
  const handleIndustry = (value: any) => {
    setIndustryVal(value);
    console.log("Industry 선택:", value);
  };

  const handleQuery = (value: any) => {
    setQueryVal(value);
    console.log("Query 선택:", value);
  };

  // 전체 데이터 조회 및 테이블 업데이트
  const selectAllData = async () => {

    if(IndustryVal){
        try {
            const response = await axios.get("http://localhost:8080/getall", {headers: {
              "Access-Control-Allow-Origin": `http://localhost:3000`,
              'Access-Control-Allow-Credentials':"true",},
              params: {industry:IndustryVal},});
            console.log("서버 응답:", response.data);
      
            // 서버 응답 데이터 -> 테이블 형식 변환 (수정해야됨)
            const formattedData = response.data.map((item: any) => [
              item.industry,
              item.transactionDate,
              item.timeLine,
              item.totalAmount,
              item.usageCnt,
            ]);
      
            // 테이블 데이터 업데이트
            setTableData({
              head: [
                "Industry",
                "Transaction Date",
                "Time",
                "Total Amount",
                "Usage Count",
              ],
              body: formattedData,
            });
      
          } catch (error) {
            console.error("API 요청 실패:", error);
          }

    } else{
        try {
          const response = await axios.get("http://localhost:8080/getall", {headers: {
            "Access-Control-Allow-Origin": `http://localhost:3000`,
            'Access-Control-Allow-Credentials':"true",},
            });
          console.log("서버 응답:", response.data);
    
          // 서버 응답 데이터 -> 테이블 형식 변환 (수정해야됨)
          const formattedData = response.data.map((item: any) => [
            item.industry,
            item.transactionDate,
            item.timeLine,
            item.totalAmount,
            item.usageCnt,
          ]);
    
          // 테이블 데이터 업데이트
          setTableData({
            head: [
              "Industry",
              "Transaction Date",
              "Time",
              "Total Amount",
              "Usage Count",
            ],
            body: formattedData,
          });
    
        } catch (error) {
          console.error("API 요청 실패:", error);
        }
    }

  };

  const insertData = async () => {
    
    try {
      const response = await axios.post("http://localhost:8080/create", null, 
      {headers: {
        "Content-Type": "application/json",
    },
        params: {industry:IndustryVal,transaction_date:format(dateVal, 'yyyy-MM-dd'), total_amount:amountVal, 
                 time_line: timelineVal, usage_cnt:usageVal, 
                 register_date:format(currentTime, 'yyyy-MM-dd')},});
                 
      console.log("서버 응답:", response.data);

    } catch (error) {
      console.error("API 요청 실패:", error);
    }
  };

  const deleteData = async () => {
    try {
      const response = await axios.post("http://localhost:8080/delete", null,
        {headers: {
            "Content-Type": "application/json",
        },
            params: {id : idVal}, });
      console.log("서버 응답:", response.data);

    } catch (error) {
      console.error("API 요청 실패:", error);
    }
  };


  return (
    <>
      <Text align="center" pt={50} fw={800} size="lg">
        시간대별 카드 동향
      </Text>

      <Flex
        gap="md"
        justify="center"
        align="center"
        direction="row"
        wrap="wrap"
        pt={30}
      >

        <DatePickerInput
            placeholder="Date"
            variant="filled"
            style ={{width : 80}}
            value={dateVal} 
            onChange={setDateVal}
            />
        
        {/* 업종 선택 */}
        <Select
          placeholder="Select industry"
          data={[
            "요식/유흥",
            "유통",
            "스포츠/문화/레저",
            "의료",
            "주유",
            "가정생활/서비스",
            "전자상거래",
            "가전/가구",
            "여행/교통",
            "교육/학원",
            "미용",
            "의류/잡화",
          ]}
          variant="filled"
          style ={{width : 130}}
          value={IndustryVal}
          onChange={handleIndustry}
          comboboxProps={{ transitionProps: { transition: 'pop', duration: 200 } }}
          searchable
          clearable
        />

        {/* 금액 입력 */}
        <TextInput
          placeholder="Total Amount"
          variant="filled"
          style ={{width : 130}}
          value={amountVal}
          onChange={(e) => setAmountVal(e.currentTarget.value)}
        />

        {/* 빈도 수 입력 */}
        <TextInput
          placeholder="Usage count"
          variant="filled"
          style ={{width : 80}}
          value={usageVal}
          onChange={(e) => setUsageVal(e.currentTarget.value)}
        />

        {/* 시간대 입력 */}
        <TextInput
          placeholder="time line"
          variant="filled"
          style ={{width : 80}}
          value={timelineVal}
          onChange={(e) => setTimeLineVal(e.currentTarget.value)}
        />

        {/* id 입력 */}
        <TextInput
          placeholder="id"
          variant="filled"
          style ={{width : 60}}
          value={idVal}
          onChange={(e) => setIdVal(e.currentTarget.value)}
        />

        {/* 쿼리 선택 */}
        <Select
          placeholder="Select Query"
          data={["select", "insert", "delete"]}
          variant="filled"
          style ={{width : 130}}
          value={queryVal}
          onChange={handleQuery}
          comboboxProps={{ transitionProps: { transition: 'pop', duration: 200 } }}
          searchable
          clearable
        />

        {/* 데이터 조회 버튼 */}
        <Button variant="light" color="red" onClick={() => {if(queryVal === 'select'){selectAllData(); }
                else if(queryVal === 'insert'){insertData();}
                else if(queryVal === 'delete'){
                    deleteData();}
                    
                    setDateVal(null)
                    setAmountVal("")
                    setCurrentTime("")
                    setIndustryVal("")
                    setUsageVal("")
                    setTimeLineVal("")
                    setIdVal(null)
                    setQueryVal("")

                }}>
          run
        </Button>
      </Flex>

      {/* 테이블 */}
      <Container pt={50}>
        <Table highlightOnHover>
          <thead>
            <tr>
              {tableData.head.map((column, index) => (
                <th key={index} style={{ textAlign: "center" }}>{column}</th>
              ))}
            </tr>
          </thead>
          <tbody>
            {tableData.body.map((row, index) => (
              <tr key={index} style={{ textAlign: "center" }}>
                {row.map((cell, idx) => (
                  <td key={idx}>{cell}</td>
                ))}
              </tr>
            ))}
          </tbody>
        </Table>
      </Container>
    </>
  );
};

export default ViewPage;
