import { axios } from "lib/axios";

export const getHistoryTableRow = async (number) => {
  try {
    const response = await axios.get(`/details/member/${number}`, {
      headers: {
        Authorization:
          "Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJBY2Nlc3NUb2tlbiIsIm5pY2tuYW1lIjoi7J6E64yA7JiBIiwiZXhwIjoxNjkyNzUxMjU1LCJlbWFpbCI6ImRhZXlvdW5nQHNzYWZ5LmNvbSJ9.d3ZDDLxu6qMkMkwPQb-eMABzXha2xiomp0Ld6PwsXXIbtVPaTEbN-HKolOPSnLXhWOdX5ZXrVUu957zDijpsvw",
      },
    });
    return response.data;
  } catch (error) {
    console.log("에러 : ", error);
    throw error;
  }
};
